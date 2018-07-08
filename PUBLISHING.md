# Publish COMMON

`gradlew clean build kluent-common:bintrayUpload`

# Publish JVM

## Pre 2.0

`gradlew clean build kluent:bintrayUpload`

## Afterwards

`gradlew clean build kluent-jvm:bintrayUpload`

# Publish ANDROID

`gradlew clean build kluent-android:bintrayUpload -PANDROID`

# Publish JS

`gradlew clean build kluent-android:bintrayUpload -PJS -PSKIPJVM`

# Publish NATIVE

`TODO`
