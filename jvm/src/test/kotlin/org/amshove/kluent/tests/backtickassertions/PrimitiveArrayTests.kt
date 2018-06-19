package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should be empty`
import org.amshove.kluent.`should contain`
import org.amshove.kluent.`should not be empty`
import org.amshove.kluent.`should not contain`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class PrimitiveArrayTests : Spek({
    given("a IntArray") {
        val theArray = intArrayOf(1, 5, 10)
        on("checking if a Int is present when it is present") {
            it("should pass") {
                theArray `should contain` 5
            }
        }
        on("checking if a Int is present which is not present") {
            it("should fail") {
                assertFails { theArray `should contain` 7 }
            }
        }
        on("checking if a Int is not present which is not present") {
            it("should pass") {
                theArray `should not contain` 7
            }
        }
        on("checking if a Int is not present which is present") {
            it("should fail") {
                assertFails { theArray `should not contain` 5 }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                shortArrayOf().`should be empty`()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.`should be empty`() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.`should not be empty`()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { intArrayOf().`should not be empty`() }
            }
        }
    }

    given("a BooleanArray") {
        val theArray = booleanArrayOf(true, true)
        on("checking if a Boolean is present when it is present") {
            it("should pass") {
                theArray `should contain` true
            }
        }
        on("checking if a Boolean is present which is not present") {
            it("should fail") {
                assertFails { theArray `should contain` false }
            }
        }
        on("checking if a Boolean is not present which is not present") {
            it("should pass") {
                theArray `should not contain` false
            }
        }
        on("checking if a Boolean is not present which is present") {
            it("should fail") {
                assertFails { theArray `should not contain` true }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                shortArrayOf().`should be empty`()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.`should be empty`() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.`should not be empty`()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { booleanArrayOf().`should not be empty`() }
            }
        }
    }

    given("a ByteArray") {
        val theArray = byteArrayOf(1, 5, 10)
        on("checking if a Byte is present when it is present") {
            it("should pass") {
                theArray `should contain` 5
            }
        }
        on("checking if a Byte is present which is not present") {
            it("should fail") {
                assertFails { theArray `should contain` 7 }
            }
        }
        on("checking if a Byte is not present which is not present") {
            it("should pass") {
                theArray `should not contain` 7
            }
        }
        on("checking if a Byte is not present which is present") {
            it("should fail") {
                assertFails { theArray `should not contain` 5 }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                shortArrayOf().`should be empty`()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.`should be empty`() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.`should not be empty`()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { byteArrayOf().`should not be empty`() }
            }
        }
    }

    given("a CharArray") {
        val theArray = charArrayOf('a', 'd', 'g')
        on("checking if a Char is present when it is present") {
            it("should pass") {
                theArray `should contain` 'd'
            }
        }
        on("checking if a Char is present which is not present") {
            it("should fail") {
                assertFails { theArray `should contain` 'b' }
            }
        }
        on("checking if a Char is not present which is not present") {
            it("should pass") {
                theArray `should not contain` 'b'
            }
        }
        on("checking if a Char is not present which is present") {
            it("should fail") {
                assertFails { theArray `should not contain` 'a' }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                shortArrayOf().`should be empty`()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.`should be empty`() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.`should not be empty`()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { charArrayOf().`should not be empty`() }
            }
        }
    }

    given("a DoubleArray") {
        val theArray = doubleArrayOf(1.0, 5.0, 10.0)
        on("checking if a Double is present when it is present") {
            it("should pass") {
                theArray `should contain` 5.0
            }
        }
        on("checking if a Double is present which is not present") {
            it("should fail") {
                assertFails { theArray `should contain` 7.0 }
            }
        }
        on("checking if a Double is not present which is not present") {
            it("should pass") {
                theArray `should not contain` 7.0
            }
        }
        on("checking if a Double is not present which is present") {
            it("should fail") {
                assertFails { theArray `should not contain` 5.0 }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                shortArrayOf().`should be empty`()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.`should be empty`() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.`should not be empty`()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { doubleArrayOf().`should not be empty`() }
            }
        }
    }

    given("a FloatArray") {
        val theArray = floatArrayOf(1f, 5f, 10f)
        on("checking if a Float is present when it is present") {
            it("should pass") {
                theArray `should contain` 5f
            }
        }
        on("checking if a Float is present which is not present") {
            it("should fail") {
                assertFails { theArray `should contain` 7f }
            }
        }
        on("checking if a Float is not present which is not present") {
            it("should pass") {
                theArray `should not contain` 7f
            }
        }
        on("checking if a Float is not present which is present") {
            it("should fail") {
                assertFails { theArray `should not contain` 5f }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                shortArrayOf().`should be empty`()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.`should be empty`() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.`should not be empty`()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { floatArrayOf().`should not be empty`() }
            }
        }
    }

    given("a LongArray") {
        val theArray = longArrayOf(1, 5, 10)
        on("checking if a Long is present when it is present") {
            it("should pass") {
                theArray `should contain` 5
            }
        }
        on("checking if a Long is present which is not present") {
            it("should fail") {
                assertFails { theArray `should contain` 7 }
            }
        }
        on("checking if a Long is not present which is not present") {
            it("should pass") {
                theArray `should not contain` 7
            }
        }
        on("checking if a Long is not present which is present") {
            it("should fail") {
                assertFails { theArray `should not contain` 5 }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                shortArrayOf().`should be empty`()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.`should be empty`() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.`should not be empty`()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { longArrayOf().`should not be empty`() }
            }
        }
    }

    given("a ShortArray") {
        val theArray = shortArrayOf(1, 5, 10)
        on("checking if a Short is present when it is present") {
            it("should pass") {
                theArray `should contain` 5
            }
        }
        on("checking if a Short is present which is not present") {
            it("should fail") {
                assertFails { theArray `should contain` 7 }
            }
        }
        on("checking if a Short is not present which is not present") {
            it("should pass") {
                theArray `should not contain` 7
            }
        }
        on("checking if a Short is not present which is present") {
            it("should fail") {
                assertFails { theArray `should not contain` 5 }
            }
        }
        on("checking if it is empty when it is empty") {
            it("should pass") {
                shortArrayOf().`should be empty`()
            }
        }
        on("checking if it is empty when it is not empty") {
            it("should fail") {
                assertFails { theArray.`should be empty`() }
            }
        }
        on("checking if it is not empty when it is not empty") {
            it("should pass") {
                theArray.`should not be empty`()
            }
        }
        on("checking if it is not empty when it is empty") {
            it("should fail") {
                assertFails { shortArrayOf().`should not be empty`() }
            }
        }
    }
})
