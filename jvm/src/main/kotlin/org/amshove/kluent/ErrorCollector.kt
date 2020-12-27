@file:JvmName("jvmerrorcollector")

package org.amshove.kluent

actual val errorCollector: ErrorCollector = ThreadLocalErrorCollector

object ThreadLocalErrorCollector : ErrorCollector {

    private val failures = object : ThreadLocal<MutableList<Throwable>>() {
        override fun initialValue(): MutableList<Throwable> = mutableListOf()
    }

    private val collectionMode = object : ThreadLocal<ErrorCollectionMode>() {
        override fun initialValue() = ErrorCollectionMode.Hard
    }

    override fun setCollectionMode(mode: ErrorCollectionMode) = collectionMode.set(mode)

    override fun getCollectionMode(): ErrorCollectionMode = collectionMode.get()

    override fun errors(): List<Throwable> = failures.get().toList()

    /**
     * Adds the given error to the current context.
     */
    override fun pushError(t: Throwable) {
        failures.get().add(t)
    }

    /**
     * Clears all errors from the current context.
     */
    override fun clear() = failures.get().clear()
}