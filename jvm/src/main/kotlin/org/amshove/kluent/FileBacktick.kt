package org.amshove.kluent

import java.io.File

fun File.`should exist`() = this.shouldExist()
fun File.`should not exist`() = this.shouldNotExist()

fun File.`should be dir`() = this.shouldBeDir()
fun File.`should not be dir`() = this.shouldNotBeDir()

fun File.`should be file`() = this.shouldBeFile()
fun File.`should not be file`() = this.shouldNotBeFile()

infix fun File.`should have extension`(other: String) = this shouldHaveExtension (other)
infix fun File.`should not have extension`(other: String) = this shouldNotHaveExtension (other)

infix fun File.`should have name`(other: String) = this shouldHaveName (other)
infix fun File.`should not have name`(other: String) = this shouldNotHaveName (other)

infix fun File.`should contain line with string`(other: String) = this shouldContainLineWithString (other)
infix fun File.`should not contain line with string`(other: String) = this shouldNotContainLineWithString (other)
