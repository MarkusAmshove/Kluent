package org.amshove.kluent

import org.mockito.Mockito.*
import org.mockito.invocation.InvocationOnMock
import org.mockito.stubbing.OngoingStubbing
import kotlin.reflect.KClass

fun <T : Any> mock(targetClass: KClass<T>): T {
    return mock(targetClass.javaObjectType)
}

infix fun <T> VerifyKeyword.on(mock: T) = verify(mock)

infix fun <T> T.that(mock: T): T = this.apply { mock.run { Unit } }

infix fun <T> VerifyNoInteractionsKeyword.on(mock: T) = verifyZeroInteractions(mock)

infix fun <T> VerifyNoFurtherInteractionsKeyword.on(mock: T) = verifyNoMoreInteractions(mock)

infix fun <T> T.was(n: CalledKeyword) = n

fun <T : Any> any(kClass: KClass<T>): T = any(kClass.javaObjectType)

infix fun <T> OngoingStubbing<T>.`it returns`(value: T): OngoingStubbing<T> = this.thenReturn(value)
infix fun <T> OngoingStubbing<T>.itReturns(value: T): OngoingStubbing<T> = this `it returns` value

infix fun <T> OngoingStubbing<T>.`it throws`(value: RuntimeException): OngoingStubbing<T> = this.thenThrow(value)
infix fun <T> OngoingStubbing<T>.itThrows(value: RuntimeException): OngoingStubbing<T> = this `it throws` value

infix fun <T> OngoingStubbing<T>.`it answers`(value: (InvocationOnMock) -> T): OngoingStubbing<T> = this.thenAnswer(value)
infix fun <T> OngoingStubbing<T>.itAnswers(value: (InvocationOnMock) -> T): OngoingStubbing<T> = this `it answers` value

infix fun <T> WhenKeyword.calling(methodCall: T): OngoingStubbing<T> = `when`(methodCall)


val When = WhenKeyword()
val Verify = VerifyKeyword()
val called = CalledKeyword()
val VerifyNoInteractions = VerifyNoInteractionsKeyword()
val `Verify no interactions` = VerifyNoInteractions
val VerifyNoFurtherInteractions = VerifyNoFurtherInteractionsKeyword()
val `Verify no further interactions` = VerifyNoFurtherInteractions

class VerifyKeyword internal constructor() {}
class CalledKeyword internal constructor() {}
class WhenKeyword internal constructor() {}
class VerifyNoInteractionsKeyword internal constructor() {}
class VerifyNoFurtherInteractionsKeyword internal constructor() {}