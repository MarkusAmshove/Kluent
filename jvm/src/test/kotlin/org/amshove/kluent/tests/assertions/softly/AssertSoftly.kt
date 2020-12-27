package org.amshove.kluent.tests.assertions.softly

import org.amshove.kluent.*
import kotlin.test.Test

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
            e.message!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo("""
                The following 2 assertions failed:
                1) Expected the CharSequence ab1 to contain 2
                at org.amshove.kluent.tests.assertions.softly.AssertSoftly.failShouldAssertSoftly(AssertSoftly.kt:16)
                2) Expected 3 to be greater or equal to 4
                at org.amshove.kluent.tests.assertions.softly.AssertSoftly.failShouldAssertSoftly(AssertSoftly.kt:17)""".replace("\\s+|\\t|\\n".toRegex(), " ").trim())
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
            e.message!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo("""
                The following assertion failed:
                Expected the CharSequence ab1 to contain 2
                at org.amshove.kluent.tests.assertions.softly.AssertSoftly.verifyAssertErrorForNonSoftlyAssertions(AssertSoftly.kt:51)"""
                    .replace("\\s+|\\t|\\n".toRegex(), " ").trim())
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
            e.message!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo("""
                The following assertion failed:
                Expected 3 to be greater or equal to 4
                at org.amshove.kluent.tests.assertions.softly.AssertSoftly.failShouldAssertSoftlyForSeveralObjects(AssertSoftly.kt:74)"""
                    .replace("\\s+|\\t|\\n".toRegex(), " ").trim())
        }
    }

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
                house.rooms.size.shouldBeEqualTo(2)
                house.guests.size.shouldBeEqualTo(6)
            }
        } catch (e: Throwable) {
            e.message!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo("""
                The following 2 assertions failed:
                1) Expected <2>, actual <3>.
                    at org.amshove.kluent.tests.assertions.softly.AssertSoftly.houseTest(AssertSoftly.kt:148)
                2) Expected <6>, actual <5>.
                    at org.amshove.kluent.tests.assertions.softly.AssertSoftly.houseTest(AssertSoftly.kt:149)
                """.replace("\\s+|\\t|\\n".toRegex(), " ").trim())
        }
    }

}