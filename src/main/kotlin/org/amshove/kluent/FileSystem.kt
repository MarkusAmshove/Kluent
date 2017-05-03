package org.amshove.kluent

import java.io.File


fun File.`should exist`() = this.exists().`should be true`()
fun File.shouldExist() = this.`should exist`()

infix fun File.`should have name`(theName: String) = this.name shouldEqual theName
infix fun File.shouldHaveName(theName: String) = this `should have name` theName
