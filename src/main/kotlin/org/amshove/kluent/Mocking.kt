package org.amshove.kluent

import com.nhaarman.mockito_kotlin.never
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.verifyNoMoreInteractions
import com.nhaarman.mockito_kotlin.verifyZeroInteractions
import org.mockito.Mockito.`when`
import org.mockito.invocation.InvocationOnMock
import org.mockito.stubbing.OngoingStubbing
import kotlin.reflect.KClass

@Suppress("UNUSED_PARAMETER") // Backward compatibility
inline fun <reified T : Any> mock(targetClass: KClass<out T>): T = mock()

inline fun <reified T : Any> mock(): T = com.nhaarman.mockito_kotlin.mock()

infix fun <T> VerifyKeyword.on(mock: T) = verify(mock)

infix fun <T> VerifyNotCalledKeyword.on(mock: T) = verify(mock, never())

infix fun <T> T.that(mock: T): T = this.apply { mock.run { Unit } }

infix fun <T : Any> VerifyNoInteractionsKeyword.on(mock: T) = verifyZeroInteractions(mock)

infix fun <T> VerifyNoFurtherInteractionsKeyword.on(mock: T) = verifyNoMoreInteractions(mock)

infix fun <T> T.was(n: CalledKeyword) = n

@Suppress("UNUSED_PARAMETER") // Backward compatibility
inline fun <reified T : Any> any(kClass: KClass<T>): T = any()
inline fun <reified T : Any> any(): T = com.nhaarman.mockito_kotlin.any()

infix fun <T> OngoingStubbing<T>.itReturns(value: T): OngoingStubbing<T> = this.thenReturn(value)

infix fun <T> OngoingStubbing<T>.itThrows(value: RuntimeException): OngoingStubbing<T> = this.thenThrow(value)

infix fun <T> OngoingStubbing<T>.itThrows(value: Error): OngoingStubbing<T> = this.thenThrow(value)

infix fun <T> OngoingStubbing<T>.itAnswers(value: (InvocationOnMock) -> T): OngoingStubbing<T> = this.thenAnswer(value)

infix fun <T> WhenKeyword.calling(methodCall: T): OngoingStubbing<T> = `when`(methodCall)


val When = WhenKeyword()
val Verify = VerifyKeyword()
val VerifyNotCalled = VerifyNotCalledKeyword()
val called = CalledKeyword()
val VerifyNoInteractions = VerifyNoInteractionsKeyword()
val VerifyNoFurtherInteractions = VerifyNoFurtherInteractionsKeyword()

class VerifyKeyword internal constructor() {}
class VerifyNotCalledKeyword internal constructor()
class CalledKeyword internal constructor() {}
class WhenKeyword internal constructor() {}
class VerifyNoInteractionsKeyword internal constructor() {}
class VerifyNoFurtherInteractionsKeyword internal constructor() {}