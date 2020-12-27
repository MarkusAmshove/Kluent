package org.amshove.kluent

object UserStackTraceConverter {

    fun getUserStacktrace(kotestStacktraces: Array<StackTraceElement>): Array<StackTraceElement> {
        return kotestStacktraces.dropUntilUserClass()
    }

    /**
     * Drops stacktraces until it finds a Kluent Stacktrace then drops stacktraces until it finds a non-Kluent stacktrace
     *
     * Sometimes, it's possible for the Stacktrace to contain classes that are not from Kluent,
     * such as classes from sun.reflect or anything from Java. After clearing these classes, we'll be at Kluent
     * stacktrace, which will contain exceptions from the Runners and some other classes
     * After everything from Kluent we'll finally be at user classes, at which point the stacktrace is clean and is
     * returned.
     */
    private fun Array<StackTraceElement>.dropUntilUserClass(): Array<StackTraceElement> {
        return toList().dropUntilFirstKluentClass().dropUntilFirstNonKluentClass().toTypedArray()
    }

    private fun List<StackTraceElement>.dropUntilFirstKluentClass(): List<StackTraceElement> {
        return dropWhile {
            it.isNotKluentClass()
        }
    }

    private fun List<StackTraceElement>.dropUntilFirstNonKluentClass(): List<StackTraceElement> {
        return dropWhile {
            it.isKluentClass()
        }
    }

    private fun StackTraceElement.isKluentClass(): Boolean {
        return className.startsWith("org.amshove.kluent")
    }

    private fun StackTraceElement.isNotKluentClass(): Boolean {
        return !isKluentClass()
    }

}