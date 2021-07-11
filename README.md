# Kluent

[![Changelog](https://img.shields.io/badge/docs-changelog-blue.svg)](https://github.com/MarkusAmshove/Kluent/blob/master/CHANGELOG.md)
[![Documentation](https://img.shields.io/badge/docs-documentation-blue.svg)](https://markusamshove.github.io/Kluent/)
[![Contributors](https://img.shields.io/badge/docs-contributors-blue.svg)](https://github.com/MarkusAmshove/Kluent/blob/master/AUTHORS.md)

[Kluent](https://markusamshove.github.io/Kluent/) is a "Fluent Assertions" library written specifically for Kotlin.

It uses the [Infix-Notations](https://kotlinlang.org/docs/reference/functions.html#infix-notation "Infix-Notation") and [Extension Functions](https://kotlinlang.org/docs/reference/extensions.html#extension-functions "Extension Functions") of Kotlin to provide a fluent wrapper around the JUnit-Assertions.

[How to contribute](CONTRIBUTING.md)


[ ![Download](https://api.bintray.com/packages/markusamshove/maven/kluent/images/download.svg) ](https://bintray.com/markusamshove/maven/kluent/_latestVersion)

----------

# Include it via gradle/maven

Kluent is hosted [here at mavenCentral](https://mvnrepository.com/artifact/org.amshove.kluent/kluent)

Kluent-Android is hosted [here at mavenCentral](https://mvnrepository.com/artifact/org.amshove.kluent/kluent-android)

## Gradle
Replace {version} with the current version and chose one of the two artifacts, based on your target platform:
```groovy
// Add jcenter as a repository for dependencies
repositories {
    mavenCentral()
}

dependencies {
    // for JVM:
    testImplementation 'org.amshove.kluent:kluent:{version}'

    // for Android:
    testImplementation 'org.amshove.kluent:kluent-android:{version}'

    // To get JUnit errors from kotlin.test, to e.g. enable diff windows in failure messages
    testImplementation "org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version"
}
```

## Maven
Replace {version} with the current version

```xml
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
```

----------

# Examples

More examples can be seen on the [Site](https://markusamshove.github.io/Kluent/) or in the [tests](https://github.com/MarkusAmshove/Kluent/tree/master/src/test/kotlin/org/amshove/kluent/tests).

### assertEquals ##

```kotlin
"hello" shouldBeEqualTo "hello"
```

### assertNotEquals ##

```kotlin
"hello" shouldNotBeEqualTo "world"
```

### Assert that an Array/Iterable contains something ##

```kotlin
val alice = Person("Alice", "Bob")
val jon = Person("Jon", "Doe")
val list = listOf(alice, jon)
list shouldContain jon
```
## Using backticks

Every method that is included in Kluent also has a "backtick version", to make it feel more like a describing sentence.

Some examples:

### assertEquals ##

```kotlin
"hello" `should be equal to` "hello"
```

### assertNotEquals ##
```kotlin
"hello" `should not be equal to` "world"
```

# Building Kluent

All projects of Kluent are built with [Gradle](http://gradle.org/)

The default `gradlew build` will only build the `common` and `jvm` module, to keep the build times as small as possible.

If you plan to submit a pull request, it is also fine if you just make sure it builds and tests against `common` and `jvm` (which `gradlew build` will make sure of),
because the rest of the heavy work will be done by Travis and AppVeyor.
That way you can keep your machine free from NodeJS and Kotlin Native :-)

To build the Android library, pass the parameter `ANDROID` to Gradle.
This will build the `common` and `android` artifacts.
To pass the parameter, type:

`gradlew build -PANDROID`

To also build the JS module, pass `JS`:

`gradlew build -PJS`

To build native, pass:

`gradlew build -PNATIVE`

In these cases, the JVM module will also be built, because it is our primary target and everything should pass on the JVM.
To skip the JVM build, e.g. for testing only against Native or JS, pass `SKIPVM`:

`gradlew build -PJS -PNATIVE -PSKIPJVM`

This command will build `common`, `js`, `native`, but not `jvm`.

## Where to put new features

If you plan to add a feature (e.g. an Assertion), it would be nice to first try adding it to the `common` module, as it would then be available to all platforms.
If it uses specific APIs, like classes from the Java standard library, then it needs to go to the `jvm` module.

If you're unsure where to put a feature, or if you want to put something in the `common` module which needs platform specific
implementations, you can have a look [here](https://github.com/MarkusAmshove/Kluent/blob/master/common/src/main/kotlin/org/amshove/kluent/Basic.kt) (`platformIsDigit` or `platformClassName`)
where a function in the `common` module calls a so called `expect` function, which is defined [here](https://github.com/MarkusAmshove/Kluent/blob/master/common/src/main/kotlin/org/amshove/kluent/internal/Platform.kt)
in the `common` module and has specific [JVM](https://github.com/MarkusAmshove/Kluent/blob/master/jvm/src/main/kotlin/org/amshove/kluent/internal/Platform.kt),
[JS](https://github.com/MarkusAmshove/Kluent/blob/master/js/src/main/kotlin/org/amshove/kluent/internal/Platform.kt)
and [Native](https://github.com/MarkusAmshove/Kluent/blob/master/native/src/main/kotlin/org/amshove/kluent/internal/Platform.kt) implementation.

If you're still unsure how to make something platform independent, we can have a look together inside the PR :-)

# Attribution

[Parts of the `assertSoftly` feature](https://github.com/MarkusAmshove/Kluent/pull/185#issuecomment-731777949) are based upon the great work of [Kotest](https://github.com/kotest/kotest) under the Apache 2.0 License.
