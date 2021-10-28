package org.amshove.kluent.tests.assertions.softly

import org.amshove.kluent.*
import org.amshove.kluent.tests.equivalency.ShouldBeEquivalentTo
import kotlin.test.Test
import kotlin.test.assertEquals

class AssertSoftly {
    @Test
    fun failShouldAssertSoftly() {
        // arrange
        val a = "ab1"

        // act
        try {
            assertSoftly(a) {
                shouldNotBeNull()
                shouldContain("2")
                length.shouldBeGreaterOrEqualTo(4)
            }
        } catch (e: Throwable) {
            assertEquals(
                """
                |The following 2 assertions failed:
                |1) Expected the CharSequence ab1 to contain 2
                |at org.amshove.kluent.tests.assertions.softly.AssertSoftly.failShouldAssertSoftly(AssertSoftly.kt:18)
                |2) Expected 3 to be greater or equal to 4
                |at org.amshove.kluent.tests.assertions.softly.AssertSoftly.failShouldAssertSoftly(AssertSoftly.kt:19)"""
                    .trimMargin(), e.message!!.trimMargin()
            )
        }
    }

    @Test
    fun passShouldAssertSoftly() {
        // arrange
        val a = "ab1"

        // act
        assertSoftly(a) {
            shouldNotBeNull()
            shouldContain("1")
            length.shouldBeGreaterOrEqualTo(3)
        }
    }

    @Test
    fun verifyAssertErrorForNonSoftlyAssertions() {
        // arrange
        val a = "ab1"

        // act
        try {
            with(a) {
                shouldNotBeNull()
                shouldContain("2")
                length.shouldBeGreaterOrEqualTo(4)
            }
        } catch (e: Throwable) {
            assertEquals(
                """
                |The following assertion failed:
                |Expected the CharSequence ab1 to contain 2
                |at org.amshove.kluent.tests.assertions.softly.AssertSoftly.verifyAssertErrorForNonSoftlyAssertions(AssertSoftly.kt:56)"""
                    .trimMargin(), e.message!!.trimMargin()
            )
        }
    }

    @Test
    fun failShouldAssertSoftlyForSeveralObjects() {
        // arrange
        val a = "ab1"
        val b = "ab2"

        // act
        try {
            assertSoftly {
                a.shouldNotBeNull()
                b.shouldContain("2")
                a.length.shouldBeGreaterOrEqualTo(4)
            }
        } catch (e: Throwable) {
            assertEquals(
                """
                |The following assertion failed:
                |Expected 3 to be greater or equal to 4
                |at org.amshove.kluent.tests.assertions.softly.AssertSoftly.failShouldAssertSoftlyForSeveralObjects(AssertSoftly.kt:81)"""
                    .trimMargin(), e.message!!
            )
        }
    }

    @ExperimentalStdlibApi
    @Test
    fun houseTest() {
        // arrange
        data class Guest(val name: String)
        class Room(val maxGuests: Int = 2) {
            private var _guests: MutableList<Guest> = mutableListOf()

            val guests: List<Guest>
                get() = _guests

            fun host(guestToHost: Guest): Boolean {
                if (_guests.size < maxGuests) {
                    _guests.add(guestToHost)
                } else {
                    return false
                }
                return true
            }
        }

        class House(val maxGuests: Int = 5) {
            private var _rooms: MutableList<Room> = mutableListOf()
            private var _guests: MutableList<Guest> = mutableListOf()

            val rooms: List<Room>
                get() = _rooms

            val guests: List<Guest>
                get() = _guests

            fun host(guestToHost: List<Guest>) {
                for (guest in guestToHost) {
                    if (_guests.size == maxGuests) {
                        return
                    }

                    if (_rooms.isEmpty()) {
                        _rooms.add(Room())
                    }
                    if (!_rooms.last().host(guest)) {
                        _rooms.add(Room())
                        _rooms.last().host(guest)
                    }

                    _guests.add(guest)
                }
            }
        }

        // act
        val guests = listOf(
            Guest("a"),
            Guest("b"),
            Guest("c"),
            Guest("d"),
            Guest("e"),
            Guest("f")
        )
        val house = House()
        house.host(guests)

        try {
            // assert
            assertSoftly {
                house.rooms.size.shouldBeEqualTo(3)
                house.guests.size.shouldBeEqualTo(5)
            }
        } catch (e: Throwable) {
            e.message!!.trimMargin().shouldBeEqualTo(
                """
                The following 2 assertions failed:
                1) Expected <2>, actual <3>.
                    at org.amshove.kluent.tests.assertions.softly.AssertSoftly.houseTest(AssertSoftly.kt:150)
                2) Expected <6>, actual <5>.
                    at org.amshove.kluent.tests.assertions.softly.AssertSoftly.houseTest(AssertSoftly.kt:151)
                """.trimMargin()
            )
        }
    }

    @Test
    fun handledExceptionThrownFromAssertSoftly() {
        // arrange
        try {
            assertSoftly {
                throw RuntimeException("Test exception")
            }
        } catch (e: Throwable) {
            // do nothing
        }

        // assert
        var errorThrown = false
        try {
            5 shouldBeEqualTo 3
        } catch (e: Throwable) {
            errorThrown = true
        }
        assertEquals(true, errorThrown)
    }

    @Test
    fun assertSoftlyCollections() {
        // arrange
        val list = listOf('x', 'y', 'z')

        // assert
        try {
            assertSoftly {
                list shouldHaveSize 2
                list shouldContainSame listOf('x', 'z')
            }
        } catch (e: Throwable) {
            assertEquals(
                """
                |The following 2 assertions failed:
                |1) Expected collection size to be 2 but was 3
                |at org.amshove.kluent.tests.assertions.softly.AssertSoftly.assertSoftlyCollections(AssertSoftly.kt:204)
                |2) The collection doesn't have the same items
                |
                |Items included on the actual collection but not in the expected: y
                |at org.amshove.kluent.tests.assertions.softly.AssertSoftly.assertSoftlyCollections(AssertSoftly.kt:205)
                """.trimMargin(), e.message!!.trimMargin()
            )
        }
    }

    @ExperimentalStdlibApi
    @Test
    fun softEquavalencyTest() {
        // arrange
        val a1 = ShouldBeEquivalentTo.E().apply {
            Flist = listOf(
                ShouldBeEquivalentTo.F(1).apply { name = "name1" },
                ShouldBeEquivalentTo.F(2).apply { name = "name2" }
            )
        }
        val a2 = ShouldBeEquivalentTo.E().apply {
            Flist = listOf(
                ShouldBeEquivalentTo.F(1).apply { name = "name1" }
            )
        }

        // assert
        try {
            assertSoftly(a1) {
                shouldBeEquivalentTo(a2)
                Flist[0].name.shouldBeEqualTo("name2")
            }
        } catch (e: Throwable) {
            assertEquals(
                """
                |The following 2 assertions failed:
                |1) Are not equivalent: 
                |Expected: <E
                |˪-Flist
                |˪--F[0] (id = 1, name = name1)
                |
                |> but was: <E
                |˪-Flist
                |˪--F[0] (id = 1, name = name1)
                |˪--F[1] (id = 2, name = name2)
                |
                |>
                |at org.amshove.kluent.tests.assertions.softly.AssertSoftly.softEquavalencyTest(AssertSoftly.kt:241)
                |2) Expected: <name2> but was: <name1>
                |at org.amshove.kluent.tests.assertions.softly.AssertSoftly.softEquavalencyTest(AssertSoftly.kt:242)
                |""".trimMargin()
                    .trimMargin(), e.message!!.trimMargin()
            )
        }
    }
}
