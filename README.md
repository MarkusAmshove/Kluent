# Kluent

[Kluent](https://markusamshove.github.io/Kluent/) is a "Fluent Assertions" library written specifically for Kotlin.

It uses the [Infix-Notations](https://kotlinlang.org/docs/reference/functions.html#infix-notation "Infix-Notation") and [Extension Functions](https://kotlinlang.org/docs/reference/extensions.html#extension-functions "Extension Functions") of Kotlin to provide a fluent wrapper around the JUnit-Asserts and Mockito.

[How to contribute](CONTRIBUTING.md)

[Contributors](AUTHORS.md)

 [ ![Download](https://api.bintray.com/packages/markusamshove/maven/Kluent/images/download.svg) ](https://bintray.com/markusamshove/maven/Kluent/_latestVersion) 


| Platform  | Status  |
|     ---       |  ---    |
| MacOs / Linux |   [![Build Status](https://travis-ci.org/MarkusAmshove/Kluent.svg?branch=master)](https://travis-ci.org/MarkusAmshove/Kluent)            |
| Windows       |  [![Build status](https://ci.appveyor.com/api/projects/status/c8j2nkwb5nc8b55a?svg=true)](https://ci.appveyor.com/project/magges/kluent) |

# [Changelog](https://markusamshove.github.io/Kluent/)
# [Documentation](https://markusamshove.github.io/Kluent/)

----------

# Include it via gradle/maven

Kluent is hosted [here at jcenter](https://bintray.com/markusamshove/maven/Kluent/view# "jCenter")

Kluent-Android is hosted [here at jcenter](https://bintray.com/markusamshove/maven/Kluent-Android/view# "jCenter")

## Gradle
Replace {version} with the current version

    // Add jcenter as a repository for dependencies
    repositories {
        jcenter()
    }

    dependencies {
        testImplementation 'org.amshove.kluent:kluent:{version}'

        // for Android:
        testImplementation 'org.amshove.kluent:kluent-android:{version}'
    }

## Maven
Replace {version} with the current version

    <!-- Add jcenter as a repository for dependencies --> 
    <repositories>
        <repository>
            <id>jcenter</id>
            <url>https://jcenter.bintray.com/</url>
        </repository>
    </repositories>

    <dependency>
        <groupId>org.amshove.kluent</groupId>
        <artifactId>kluent</artifactId>
        <version>{version}</version>
        <type>pom</type>
    </dependency>


----------

# Examples

More examples can be seen on the [Site](https://markusamshove.github.io/Kluent/) or in the [tests](https://github.com/MarkusAmshove/Kluent/tree/master/src/test/kotlin/org/amshove/kluent/tests).

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

### assertEquals ##

    "hello" `should equal` "hello"

### assertNotEquals ##

    "hello" `should not equal` "world"





