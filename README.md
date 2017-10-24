# Kluent

[Kluent](https://markusamshove.github.io/Kluent/) is a "Fluent Assertions" library written specifically for Kotlin.

It uses the [Infix-Notations](https://kotlinlang.org/docs/reference/functions.html#infix-notation "Infix-Notation") and [Extension Functions](https://kotlinlang.org/docs/reference/extensions.html#extension-functions "Extension Functions") of Kotlin to provide a fluent wrapper around the JUnit-Asserts and Mockito.

Kluent 1.x uses JUnit 4 and Kluent 2.x uses JUnit 5. For more, read through the [Changelog and Documentation](https://markusamshove.github.io/Kluent/)

[![Download](https://api.bintray.com/packages/markusamshove/maven/Kluent/images/download.svg)](https://bintray.com/markusamshove/maven/Kluent/_latestVersion) [![Build Status](https://travis-ci.org/MarkusAmshove/Kluent.svg?branch=master)](https://travis-ci.org/MarkusAmshove/Kluent)

----------

# Usage with dependency managers

Kluent is hosted [on jCenter](https://bintray.com/markusamshove/maven/Kluent/view# "jCenter")

Kluent-Android is hosted [on jCenter](https://bintray.com/markusamshove/maven/Kluent-Android/view# "jCenter")

## Gradle
Replace {version} with the current version

    dependencies {
        testCompile 'org.amshove.kluent:kluent:{version}'

        // for Android:
        testImplementation 'org.amshove.kluent:kluent-android:{version}'
    }

## Maven
Replace {version} with the current version

    <dependency>
        <groupId>org.amshove.kluent</groupId>
        <artifactId>kluent</artifactId>
        <version>{version}</version>
        <type>pom</type>
    </dependency>

----------

# Examples

More examples can be seen on the [site](https://markusamshove.github.io/Kluent/) or in the [tests](https://github.com/MarkusAmshove/Kluent/tree/master/src/test/kotlin/org/amshove/kluent/tests).

### assertEquals ##

    "hello" shouldEqual "hello"

### assertNotEquals ##

    "hello" shouldNotEqual "world"

### Assert that an Array/Iterable contains something ##

    val alice = Person("Alice", "Bob")
    val jon = Person("Jon", "Doe")
    val list = listOf(alice, jon)
    list shouldContain jon

### Stubbing

    val stub = mock(Database::class)
    val bob = Person("Bob", "Guy")
    When calling stub.getPerson() itReturns bob

## Using backticks

Every method that is included in Kluent also has a "backtick version", to make it feel more like a describing sentence.

Some examples:

1. assertEquals: ``` "hello" `should equal` "hello" ```
2. assertNotEquals: ```"hello" `should not equal` "world"```
