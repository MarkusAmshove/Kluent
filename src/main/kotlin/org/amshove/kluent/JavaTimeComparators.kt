package org.amshove.kluent

import org.junit.jupiter.api.Assertions
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

abstract class AbstractJavaTimeComparator<T> where T : Comparable<T> {
    internal var comparatorType = ComparatorType.Exactly
    internal lateinit var startValue: T

    internal fun assertAfter(theOther: T) =
            when (comparatorType) {
                ComparatorType.AtLeast -> assertAtLeastAfter(calculateComparedValue(theOther))
                ComparatorType.Exactly -> assertExactlyAfter(calculateComparedValue(theOther))
                ComparatorType.AtMost -> assertAtMostAfter(calculateComparedValue(theOther))
            }

    internal fun assertBefore(theOther: T) =
            when (comparatorType) {
                ComparatorType.AtLeast -> assertAtLeastBefore(calculateComparedValue(theOther, -1))
                ComparatorType.Exactly -> assertExactlyBefore(calculateComparedValue(theOther, -1))
                ComparatorType.AtMost -> assertAtMostBefore(calculateComparedValue(theOther, -1))
            }

    internal fun withStartValue(startValue: T): AbstractJavaTimeComparator<T> {
        this.startValue = startValue
        return this
    }

    internal fun withComparatorType(comparatorType: ComparatorType): AbstractJavaTimeComparator<T> {
        this.comparatorType = comparatorType
        return this
    }

    protected fun assertAtLeastAfter(theOther: T) {
        Assertions.assertTrue(startValue >= theOther, "Expected $startValue to be at least { ${getExpectedOffset()} } after $theOther")
    }

    protected fun assertAtMostAfter(theOther: T) {
        Assertions.assertTrue(startValue <= theOther, "Expected $startValue to be at most { ${getExpectedOffset()} } after $theOther")
    }

    protected fun assertExactlyAfter(theOther: T) {
        Assertions.assertTrue(startValue == theOther, "Expected $startValue to be { ${getExpectedOffset()} } after $theOther")
    }

    protected fun assertExactlyBefore(theOther: T) {
        Assertions.assertTrue(startValue == theOther, "Expected $startValue to be { ${getExpectedOffset()} } before $theOther")
    }

    protected fun assertAtLeastBefore(theOther: T) {
        Assertions.assertTrue(startValue <= theOther, "Expected $startValue to be at least { ${getExpectedOffset()} } before $theOther")
    }

    protected fun assertAtMostBefore(theOther: T) {
        Assertions.assertTrue(startValue >= theOther, "Expected $startValue to be at most { ${getExpectedOffset()} } before $theOther")
    }

    protected abstract fun calculateComparedValue(currentValue: T, multiplier: Int = 1): T
    internal abstract fun getExpectedOffset(): String

}

class DateTimeComparator(internal var dateComparator: DateComparator? = null, internal var timeComparator: TimeComparator? = null) : AbstractJavaTimeComparator<LocalDateTime>() {

    internal fun assertAfter(theDate: LocalDate) = dateComparator!!.withStartValue(startValue.toLocalDate()).withComparatorType(comparatorType).assertAfter(theDate)
    internal fun assertBefore(theDate: LocalDate) = dateComparator!!.withStartValue(startValue.toLocalDate()).withComparatorType(comparatorType).assertBefore(theDate)
    internal fun assertAfter(theTime: LocalTime) = timeComparator!!.withStartValue(startValue.toLocalTime()).withComparatorType(comparatorType).assertAfter(theTime)
    internal fun assertBefore(theTime: LocalTime) = timeComparator!!.withStartValue(startValue.toLocalTime()).withComparatorType(comparatorType).assertBefore(theTime)

    override fun getExpectedOffset() = "${dateComparator?.getExpectedOffset()} ${timeComparator?.getExpectedOffset()}".trim()

    override fun calculateComparedValue(currentValue: LocalDateTime, multiplier: Int) =
            currentValue.plusYears((dateComparator?.addedYears?.toLong() ?: 0) * multiplier)
                    .plusMonths((dateComparator?.addedMonths?.toLong() ?: 0) * multiplier)
                    .plusDays((dateComparator?.addedDays?.toLong() ?: 0) * multiplier)
                    .plusHours((timeComparator?.addedHours?.toLong() ?: 0) * multiplier)
                    .plusMinutes((timeComparator?.addedMinutes?.toLong() ?: 0) * multiplier)
                    .plusSeconds((timeComparator?.addedSeconds?.toLong() ?: 0) * multiplier)


}

class DateComparator(internal val addedYears: Int = 0, internal val addedMonths: Int = 0, internal val addedDays: Int = 0) : AbstractJavaTimeComparator<LocalDate>() {

    override fun calculateComparedValue(currentValue: LocalDate, multiplier: Int) =
            currentValue.plusYears(addedYears.toLong() * multiplier)
                    .plusMonths(addedMonths.toLong() * multiplier)
                    .plusDays(addedDays.toLong() * multiplier)

    override fun getExpectedOffset() = "$addedYears years, $addedMonths months, $addedDays days"

}

class TimeComparator(internal val addedHours: Int = 0, internal val addedMinutes: Int = 0, internal val addedSeconds: Int = 0) : AbstractJavaTimeComparator<LocalTime>() {
    override fun getExpectedOffset() = "$addedHours hours, $addedMinutes minutes, $addedSeconds seconds"

    override fun calculateComparedValue(currentValue: LocalTime, multiplier: Int) =
            currentValue.plusHours(addedHours.toLong() * multiplier)
                    .plusMinutes(addedMinutes.toLong() * multiplier)
                    .plusSeconds(addedSeconds.toLong() * multiplier)

}

