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

## Running the Tests

Your pull request will be automatically build and tested by [Travis](https://travis-ci.org/MarkusAmshove/Kluent).
To make sure that the build won't fail, you can the build again locally:

```bash
$ ./gradlew clean build
```

To make sure your changes also run against Android, run

```bash
$ ./gradlew clean build -PANDROID
```

## Testing in your projects

If you want to test your changes in your local projects, increment the `version` in `build.gradle` (but make sure not to commit it) and run

```bash
$ ./gradlew install
# for Android:
$ ./gradlew install -PANDROID
```

which will put the artifact into your local maven cache.

In your project, make sure to add `mavenLocal()` as a repository:
```groovy
repositories {
    mavenLocal()
}
```

and also change the Kluent dependency to the version you previously specified.

If you build your own project again, Gradle should pull your Kluent version from the local maven repository.

## Coding Style

Our coding style is the default code style coming with IntelliJ.
