package org.amshove.kluent

import kotlin.reflect.KProperty1

class EquivalencyAssertionOptions {
    init {
        compareByProperties()
    }

    private var _compareByProperties: Boolean = true
    private var _excludingNestedObjects: Boolean = false
    private var _allowingInfiniteRecursion: Boolean = false
    private var _maxLevelOfRecursion = 10
    private var _withStrictOrdering: Boolean = false

    internal var compareByProperties
        get() = _compareByProperties
        private set(value) { _compareByProperties = value }

    internal val includedProperties: MutableList<KProperty1<*, *>> = mutableListOf()
    internal val excludedProperties: MutableList<KProperty1<*, *>> = mutableListOf()

    internal var excludingNestedObjects
        get() = _excludingNestedObjects
        private set(value) { _excludingNestedObjects = value }

    internal var allowingInfiniteRecursion
        get() = _allowingInfiniteRecursion
        private set(value) { _allowingInfiniteRecursion = value }

    internal var maxLevelOfRecursion
        get() = _maxLevelOfRecursion
        internal set(value) {
            _maxLevelOfRecursion = value
        }

    internal var withStrictOrdering
        get() = _withStrictOrdering
        private set(value) { _withStrictOrdering = value }


    fun compareByProperties(): EquivalencyAssertionOptions {
        compareByProperties = true
        return this
    }

    fun notCompareByProperties(): EquivalencyAssertionOptions {
        compareByProperties = false
        return this
    }

    fun excluding(property: KProperty1<*, *>): EquivalencyAssertionOptions {
        excludedProperties.add(property)
        return this
    }

    fun including(property: KProperty1<*, *>): EquivalencyAssertionOptions {
        includedProperties.add(property)
        return this
    }

    fun excludingNestedObjects(): EquivalencyAssertionOptions {
        excludingNestedObjects = true
        return this
    }

    fun allowingInfiniteRecursion(): EquivalencyAssertionOptions {
        allowingInfiniteRecursion = true
        return this
    }

    fun withStrictOrdering(): EquivalencyAssertionOptions {
        withStrictOrdering = true
        return this
    }
}
