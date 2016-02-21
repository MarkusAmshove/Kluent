# Kluent

Kluent is a "Fluent Assertions" library written specifically for Kotlin.

It uses the [Infix-Notations](https://kotlinlang.org/docs/reference/functions.html#infix-notation "Infix-Notation") and [Extension Functions](https://kotlinlang.org/docs/reference/extensions.html#extension-functions "Extension Functions") of Kotlin to provide a fluent wrapper around the JUnit-Asserts and Mockito.

 [ ![Download](https://api.bintray.com/packages/markusamshove/maven/Kluent/images/download.svg) ](https://bintray.com/markusamshove/maven/Kluent/_latestVersion) [![Build Status](https://travis-ci.org/MarkusAmshove/Kluent.svg?branch=master)](https://travis-ci.org/MarkusAmshove/Kluent)


----------

# Examples

More examples can be seen in the [Wiki](https://github.com/MarkusAmshove/Kluent/wiki) or [tests](https://github.com/MarkusAmshove/Kluent/tree/master/src/test/kotlin/org/amshove/kluent/tests).

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



----------

# Include it via gradle/maven

Kluent is hosted in [jCenter](https://bintray.com/markusamshove/maven/Kluent/view# "jCenter")

## Gradle
    dependencies {
        testCompile 'org.amshove.kluent:kluent:1.4'
    }

## Maven
    <dependency> 
        <groupId>org.amshove.kluent</groupId>
        <artifactId>kluent</artifactId>
        <version>1.4</version>
        <type>pom</type>
    </dependency>





