package org.amshove.kluent

import org.mockito.invocation.InvocationOnMock
import org.mockito.stubbing.OngoingStubbing

infix fun <T> OngoingStubbing<T>.`it returns`(value: T) = this.itReturns(value)
infix fun <T> OngoingStubbing<T>.`it throws`(value: RuntimeException) = this.itThrows(value)
infix fun <T> OngoingStubbing<T>.`it throws`(value: Error) = this.itThrows(value)
infix fun <T> OngoingStubbing<T>.`it answers`(value: (InvocationOnMock) -> T) = this.itAnswers(value)
val `Verify no interactions` = VerifyNoInteractions
val `Verify no further interactions` = VerifyNoFurtherInteractions