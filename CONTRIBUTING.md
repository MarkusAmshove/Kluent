# Introduction

Thank you for considering contributing to Kluent!
A lot of the assertions within this library come from the community, which is awesome!

# Development Guide

We're looking for all kinds of contributions, may it be additional assertions, updates to the docs, better assertion failure messages or filing issues.

## GitHub Workflow

1. [Fork this repository](https://github.com/MarkusAmshove/Kluent) on GitHub.

2. Clone your fork locally:
    ```bash
    $ git clone <url-to-your-fork>
    ```

3. Add the official repository (`upstream`) as a remote repository:
    ```bash
    $ git remote add upstream https://github.com/MarkusAmshove/Kluent.git
    ```

4. Build the project once to download all dependencies (or import it in your IDE):

    ```bash
    $ ./gradlew build
    ```

    This will download gradle if it isn't already on your machine and also download all dependencies of Kluent.
    Furthermore it'll build the project and execute all tests.

5. Create a branch for your bugfix or feature based off the `master` branch:

    ```bash
    $ git checkout -b <name-bugfix-or-feature> master
    ```

6. If the changes you make take a few days, be sure to occasionally pull the latest changes from `upstream`, to ensure that your local branch is up-to-date:

    ```bash
    $ git pull upstream master
    ```

7. When your work is done, push your local branch to your fork:

    ```bash
    $ git push origin <name-of-bugfix-or-feature>
    ```

8. [Create a pull request](https://help.github.com/articles/creating-a-pull-request-from-a-fork/)
   on GitHub.


NOTE: When the build fails after your changes and you don't know why, don't hesitate to create a pull request anyway,
we might be able to help you!

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

## Coding Style

Our coding style is the default code style coming with IntelliJ.
