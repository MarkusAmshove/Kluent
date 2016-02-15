package org.amshove.kluent.tests.helpclasses


interface Database {
    fun getPerson(): Person
    fun getPerson(id: Int): Person
}

