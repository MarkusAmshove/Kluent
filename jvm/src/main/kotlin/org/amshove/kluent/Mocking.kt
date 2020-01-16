package org.amshove.kluent

import com.nhaarman.mockitokotlin2.*
import org.mockito.AdditionalAnswers.*
import org.mockito.Mockito.`when`
import org.mockito.internal.util.MockUtil
import org.mockito.invocation.InvocationOnMock
import org.mockito.stubbing.Answer
import org.mockito.stubbing.OngoingStubbing
import kotlin.reflect.KClass



@Suppress("UNUSED_PARAMETER") // Backward compatibility
inline fun <reified T : Any> mock(targetClass: KClass<out T>): T = mock()

inline fun <reified T : Any> mock(): T = com.nhaarman.mockitokotlin2.mock()

infix fun VerifyKeyword.times(numInvocations: Int) = OngoingVerification(numInvocations)

infix fun <T> OngoingVerification.on(mock: T) = verify(mock, times(numInvocations))

infix fun <T> VerifyKeyword.on(mock: T) = verify(mock)

infix fun <T> VerifyNotCalledKeyword.on(mock: T) = verify(mock, never())

infix fun <T> T.that(mock: T): T {
    ensureMock(this)
    return this.apply { mock.run { Unit } }
}

infix fun <T : Any> VerifyNoInteractionsKeyword.on(mock: T) = verifyZeroInteractions(mock)

infix fun <T> VerifyNoFurtherInteractionsKeyword.on(mock: T) = verifyNoMoreInteractions(mock)

infix fun <T> T.was(n: CalledKeyword) = n

@Suppress("UNUSED_PARAMETER") // Backward compatibility
inline fun <reified T : Any> any(kClass: KClass<T>): T = any()

inline fun <reified T : Any> any(): T = com.nhaarman.mockitokotlin2.any()

infix fun <T> WhenKeyword.calling(methodCall: T): OngoingStubbing<T> = `when`(methodCall)

infix fun <T> OngoingStubbing<T>.itReturns(value: T): OngoingStubbing<T> = this.thenReturn(value)

infix fun <T> OngoingStubbing<T>.itThrows(value: Throwable): OngoingStubbing<T> = this.thenThrow(value)

infix fun <T> OngoingStubbing<T>.itAnswers(value: (InvocationOnMock) -> T): OngoingStubbing<T> = this.thenAnswer(value)

infix fun <T> OngoingStubbing<T>.itAnswers(value: Answer<T>): OngoingStubbing<T> = this.thenAnswer(value)

/**
 * Returns the parameter of an invocation at the given position.
 * @param position Location of the parameter to return, zero based.
 * @see [returnsArgAt]
 */
fun <T> withArgAt(position: Int): Answer<T> = returnsArgAt(position)
fun <T> withFirstArg(): Answer<T> = returnsFirstArg()
fun <T> withSecondArg(): Answer<T> = returnsSecondArg()
fun <T> withThirdArg(): Answer<T> = withArgAt(2)
fun <T> withFourthArg(): Answer<T> = withArgAt(3)
fun <T> withLastArg(): Answer<T> = returnsLastArg()

private fun <T> ensureMock(obj: T) {
    if (!MockUtil.isMock(obj)) {
        throw Exception("""
            $obj is no mock.

            Ensure to always determine the mock with the `on` method.
            Example:
                Verify on myMock that myMock.getPerson() was called
                       /\
                --------
            """)
    }
}


val When = WhenKeyword()
val Verify = VerifyKeyword()
val VerifyNotCalled = VerifyNotCalledKeyword()
val called = CalledKeyword()
val VerifyNoInteractions = VerifyNoInteractionsKeyword()
val VerifyNoFurtherInteractions = VerifyNoFurtherInteractionsKeyword()

class VerifyKeyword internal constructor()
class VerifyNotCalledKeyword internal constructor()
class CalledKeyword internal constructor()
class WhenKeyword internal constructor()
class VerifyNoInteractionsKeyword internal constructor()
class VerifyNoFurtherInteractionsKeyword internal constructor()

class OngoingVerification(val numInvocations: Int)