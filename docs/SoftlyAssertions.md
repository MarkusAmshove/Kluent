# Softly Assertions

Inspired by [Kotest](https://github.com/kotest/kotest):

Usually if an assertion fails, it throws an exception, so you can immediately note that your test fails:

```kt
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

        // assert
        house.rooms.size.shouldBeEqualTo(2)
        house.guests.size.shouldBeEqualTo(6)
    }
```

As the result:

*java.lang.AssertionError:*
*The following assertion failed:*
*Expected <2>, actual <3>.*

But why is it failed? Why 6 guests occupied 3 rooms? Now let's move our assertions into assertSoftly:

```kt
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

        // assert
        assertSoftly {
            house.rooms.size.shouldBeEqualTo(2)
            house.guests.size.shouldBeEqualTo(6)
        }
    }
```

Now we get all assertions at once:

*org.amshove.kluent.MultiAssertionError:*
*The following 2 assertions failed:*
*1) Expected <2>, actual <3>.*
*at org.amshove.kluent.tests.assertions.softly.AssertSoftly.houseTest(AssertSoftly.kt:147)*
*2) Expected <6>, actual <5>.*
*at org.amshove.kluent.tests.assertions.softly.AssertSoftly.houseTest(AssertSoftly.kt:148)*

If you like, you can use a bit different syntax achieving the same result:

```kt
        assertSoftly(house) {
            rooms.size.shouldBeEqualTo(2)
            guests.size.shouldBeEqualTo(6)
        }
```

## Compatibility note

The following assertions are not compatible with `assertSoftly` and exit the test immediately after failure:

* `assertFails`
* `shouldNotBeNull`
* `a.shouldBeInstanceOf<B>()`