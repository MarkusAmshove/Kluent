function Publish-Artifact($name, $gradleFlags) {
    Write-Host "Starting $name" -Foreground Yellow
    .\gradlew clean build $gradleFlags
    if($?) {
        Write-Host "Published $name" -Foreground Green
    } else {
        throw "Failure when publishing $name"
    }
}


Publish-Artifact "Common" @("kluent-common:bintrayUpload")
Publish-Artifact "Java" @("kluent:bintrayUpload")
Publish-Artifact "Android" @("kluent-android:bintrayUpload", "-PANDROID")
Publish-Artifact "JavaScript" @("kluent-js:bintrayUpload", "-PJS", "-PSKIPJVM")
