package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldBeEmpty
import org.amshove.kluent.shouldContain
import org.amshove.kluent.shouldNotBeEmpty
import org.amshove.kluent.shouldNotContain
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class PrimitiveArrayTests : Spek({
    given("a IntArray") {
        val theArray = intArrayOf(1, 5, 10)
        on("checking if a Int is present when it is present") {
            it("should pass") {
                theArray.shouldContain(5)
            }
        }
        on("checking if a Int is present which is not present") {
            it("should fail") {
                assertFails { theArray.shouldContain(7) }
            }
        }
        on("checking if a Int is not present which is not present") {
            it("should pass") {
                theArray.shouldNotContain(7)
            }
        }
        on("checking if a Int is not present which is present") {
            it("should fail") {
                assertFails { theArray.shouldNotContain(5) }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                intArrayOf().shouldBeEmpty()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.shouldBeEmpty() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.shouldNotBeEmpty()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { intArrayOf().shouldNotBeEmpty() }
            }
        }
    }

    given("a BooleanArray") {
        val theArray = booleanArrayOf(true, true)
        on("checking if a Boolean is present when it is present") {
            it("should pass") {
                theArray.shouldContain(true)
            }
        }
        on("checking if a Boolean is present which is not present") {
            it("should fail") {
                assertFails { theArray.shouldContain(false) }
            }
        }
        on("checking if a Boolean is not present which is not present") {
            it("should pass") {
                theArray.shouldNotContain(false)
            }
        }
        on("checking if a Boolean is not present which is present") {
            it("should fail") {
                assertFails { theArray.shouldNotContain(true) }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                booleanArrayOf().shouldBeEmpty()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.shouldBeEmpty() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.shouldNotBeEmpty()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { booleanArrayOf().shouldNotBeEmpty() }
            }
        }
    }

    given("a ByteArray") {
        val theArray = byteArrayOf(1, 5, 10)
        on("checking if a Byte is present when it is present") {
            it("should pass") {
                theArray.shouldContain(5)
            }
        }
        on("checking if a Byte is present which is not present") {
            it("should fail") {
                assertFails { theArray.shouldContain(7) }
            }
        }
        on("checking if a Byte is not present which is not present") {
            it("should pass") {
                theArray.shouldNotContain(7)
            }
        }
        on("checking if a Byte is not present which is present") {
            it("should fail") {
                assertFails { theArray.shouldNotContain(5) }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                byteArrayOf().shouldBeEmpty()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.shouldBeEmpty() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.shouldNotBeEmpty()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { byteArrayOf().shouldNotBeEmpty() }
            }
        }
    }

    given("a CharArray") {
        val theArray = charArrayOf('a', 'd', 'f')
        on("checking if a Char is present when it is present") {
            it("should pass") {
                theArray.shouldContain('d')
            }
        }
        on("checking if a Char is present which is not present") {
            it("should fail") {
                assertFails { theArray.shouldContain('b') }
            }
        }
        on("checking if a Char is not present which is not present") {
            it("should pass") {
                theArray.shouldNotContain('b')
            }
        }
        on("checking if a Char is not present which is present") {
            it("should fail") {
                assertFails { theArray.shouldNotContain('a') }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                charArrayOf().shouldBeEmpty()
            }
            on("checking if it is empty when it is not empty") {
                it("should fail") {
                    assertFails { theArray.shouldBeEmpty() }
                }
            }
            on("checking if it is not empty when it is not empty") {
                it("should pass") {
                    theArray.shouldNotBeEmpty()
                }
            }
            on("checking if it is not empty when it is empty") {
                it("should fail") {
                    assertFails { charArrayOf().shouldNotBeEmpty() }
                }
            }
        }
    }

    given("a DoubleArray") {
        val theArray = doubleArrayOf(1.0, 5.0, 10.0)
        on("checking if a Double is present when it is present") {
            it("should pass") {
                theArray.shouldContain(5.0)
            }
        }
        on("checking if a Double is present which is not present") {
            it("should fail") {
                assertFails { theArray.shouldContain(7.0) }
            }
        }
        on("checking if a Double is not present which is not present") {
            it("should pass") {
                theArray.shouldNotContain(7.0)
            }
        }
        on("checking if a Double is not present which is present") {
            it("should fail") {
                assertFails { theArray.shouldNotContain(5.0) }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                doubleArrayOf().shouldBeEmpty()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.shouldBeEmpty() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.shouldNotBeEmpty()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { doubleArrayOf().shouldNotBeEmpty() }
            }
        }
    }

    given("a FloatArray") {
        val theArray = floatArrayOf(1f, 5f, 10f)
        on("checking if a Float is present when it is present") {
            it("should pass") {
                theArray.shouldContain(5f)
            }
        }
        on("checking if a Float is present which is not present") {
            it("should fail") {
                assertFails { theArray.shouldContain(7f) }
            }
        }
        on("checking if a Float is not present which is not present") {
            it("should pass") {
                theArray.shouldNotContain(7f)
            }
        }
        on("checking if a Float is not present which is present") {
            it("should fail") {
                assertFails { theArray.shouldNotContain(5f) }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                floatArrayOf().shouldBeEmpty()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.shouldBeEmpty() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.shouldNotBeEmpty()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { floatArrayOf().shouldNotBeEmpty() }
            }
        }
    }

    given("a LongArray") {
        val theArray = longArrayOf(1, 5, 10)
        on("checking if a Long is present when it is present") {
            it("should pass") {
                theArray.shouldContain(5)
            }
        }
        on("checking if a Long is present which is not present") {
            it("should fail") {
                assertFails { theArray.shouldContain(7) }
            }
        }
        on("checking if a Long is not present which is not present") {
            it("should pass") {
                theArray.shouldNotContain(7)
            }
        }
        on("checking if a Long is not present which is present") {
            it("should fail") {
                assertFails { theArray.shouldNotContain(5) }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                longArrayOf().shouldBeEmpty()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.shouldBeEmpty() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.shouldNotBeEmpty()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { longArrayOf().shouldNotBeEmpty() }
            }
        }
    }

    given("a ShortArray") {
        val theArray = shortArrayOf(1, 5, 10)
        on("checking if a Short is present when it is present") {
            it("should pass") {
                theArray.shouldContain(5)
            }
        }
        on("checking if a Short is present which is not present") {
            it("should fail") {
                assertFails { theArray.shouldContain(7) }
            }
        }
        on("checking if a Short is not present which is not present") {
            it("should pass") {
                theArray.shouldNotContain(7)
            }
        }
        on("checking if a Short is not present which is present") {
            it("should fail") {
                assertFails { theArray.shouldNotContain(5) }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                shortArrayOf().shouldBeEmpty()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.shouldBeEmpty() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.shouldNotBeEmpty()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { shortArrayOf().shouldNotBeEmpty() }
            }
        }
    }
})
