#!/bin/bash

set -e

echo 'Building Java'
./gradlew clean build

echo 'Building Android'
./gradlew clean build -PANDROID

echo 'Building JS'
./gradlew clean build -PJS -PSKIPJVM
