#!/bin/bash

if [[ $# -ne 2 ]]; then
    echo Missing parameters. Use "publishAll.sh BINTRAY_USER BINTRAY_KEY" >&2
    exit 2
fi

BINTRAY_USER="$1"
BINTRAY_KEY="$2"

function publish {
    name=$1
    flags=$2

    if ./gradlew clean build $flags -PbintrayUser="$BINTRAY_USER" -PbintrayKey="$BINTRAY_KEY"; then
        echo "Published $name"
    else
        echo
        echo "Failed to publish $name" >&2
        exit 1
    fi
}

publish "Common" "kluent-common:bintrayUpload"
publish "JVM" "kluent:bintrayUpload"
publish "Android" "kluent-android:bintrayUpload -PANDROID"
publish "JavaScript" "kluent-js:bintrayUpload -PJS -PSKIPJVM"
