package org.amshove.kluent

import org.mockito.Mock
import org.mockito.invocation.InvocationOnMock
import org.mockito.stubbing.OngoingStubbing
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import kotlin.reflect.KClass

fun <T : Any> mock(targetClass: KClass<T>) : T { return mock(targetClass.javaObjectType) }
infix fun <T> WhenClause.calling(methodCall: T): OngoingStubbing<T> = `when`(methodCall)
infix fun <T> OngoingStubbing<T>.itReturns(value: T): OngoingStubbing<T> = this.thenReturn(value)
infix fun <T> OngoingStubbing<T>.itAnswers(value: (InvocationOnMock) -> T): OngoingStubbing<T> = this.thenAnswer(value)
infix fun <T> T.that(mock: T) : T = this.apply { mock }
infix fun <T> VerifyClause.on(mock: T) = verify(mock)
infix fun <T> T.was(n : CalledKeyword) = Unit

val When = WhenClause()
val Verify = VerifyClause()
val called = CalledKeyword()

class WhenClause internal constructor() {}
class VerifyClause internal constructor() {}
class CalledKeyword internal constructor() {}