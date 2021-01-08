package org.amshove.kluent

import org.mockito.invocation.InvocationOnMock
import org.mockito.stubbing.Answer
import org.mockito.stubbing.OngoingStubbing

infix fun <T> OngoingStubbing<T>.`it returns`(value: T) = this.itReturns(value)
infix fun <T> OngoingStubbing<T>.`it throws`(value: Throwable) = this.itThrows(value)
infix fun <T> OngoingStubbing<T>.`it answers`(value: (InvocationOnMock) -> T) = this.itAnswers(value)
infix fun <T> OngoingStubbing<T>.`it answers`(value: Answer<T>) = this.itAnswers(value)
val `Verify not called` = VerifyNotCalled
val `Verify no interactions` = VerifyNoInteractions
val `Verify no further interactions` = VerifyNoFurtherInteractions
