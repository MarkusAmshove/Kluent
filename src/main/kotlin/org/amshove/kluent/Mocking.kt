package org.amshove.kluent

import org.mockito.Mockito.*
import kotlin.reflect.KClass

fun <T : Any> mock(targetClass: KClass<T>): T {
    return mock(targetClass.javaObjectType)
}

infix fun <T> VerifyClause.on(mock: T) = verify(mock)
infix fun <T> T.that(mock: T): T = this.apply { mock.run { Unit } }
infix fun <T> VerifyNoInteractionsKeyword.on(mock: T) = verifyZeroInteractions(mock)
infix fun <T> VerifyNoFurtherInteractionsKeyword.on(mock: T) = verifyNoMoreInteractions(mock)
infix fun <T> T.was(n: CalledKeyword) = n
fun <T : Any> any(kClass: KClass<T>): T = any(kClass.javaObjectType)

val Verify = VerifyClause()
val VerifyNoInteractions = VerifyNoInteractionsKeyword()
val VerifyNoFurtherInteractions = VerifyNoInteractionsKeyword()
val called = CalledKeyword()

class VerifyClause internal constructor() {}
class CalledKeyword internal constructor() {}
class VerifyNoInteractionsKeyword internal constructor() {}
class VerifyNoFurtherInteractionsKeyword internal constructor() {}