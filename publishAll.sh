#!/bin/bash

set -u

if [ $# != 0 ] && [ $# != 3 ];then
	echo "Usage:"
	echo "  ./publishAll.sh"
	echo "  ./publishAll.sh SONATYPE_USERNAME SONATYPE_PASSWORD SIGNING_KEY"
	exit 1
fi

if [ $# == 3 ];then
	USERNAME_TOKEN="$1"
	PASSWORD_TOKEN="$2"
	SIGNING_KEY="$3"
else
	read -p "Sonatype username token: " USERNAME_TOKEN
	read -p "Sonatype password token: " PASSWORD_TOKEN
	read -p "Signing key: " SIGNING_KEY
fi


function publish {
	PARAM=""
	if [ $# == 1 ];then
		PARAM="$1"
	fi

	./gradlew clean check publishMavenJavaPublicationToMavenRepository -Psigning.gnupg.keyName="$SIGNING_KEY" -PossrhUsername=$USERNAME_TOKEN -PossrhPassword=$PASSWORD_TOKEN $PARAM
	RC="$?"
	if [ $RC != 0 ];then
		echo "Building with parameter <$PARAM> failed"
		exit 1
	else
		echo "Publishing with parameter <$PARAM> succeeded"
	fi
}

./gradlew checkJavaVersion

publish
publish "-PANDROID"
publish "-PJS"
