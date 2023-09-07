package com.metanit.kotlin.flows.map_transform.example1

import kotlinx.coroutines.flow.*

suspend fun main() {

    val peopleFlow: Flow<Person> = listOf(
        Person("Tom", 37),
        Person("Sam", 41),
        Person("Bob", 21)
    ).asFlow()

    peopleFlow.map { person -> person.name }.collect { personName -> println(personName) }
}

data class Person(val name: String, val age: Int)

//    Tom
//    Sam
//    Bob