package com.metanit.kotlin.flows.map_transform.example3

import kotlinx.coroutines.flow.*

suspend fun main() {

    val peopleFlow: Flow<Person> = listOf(
        Person("Tom", 37),
        Person("Bill", 5),
        Person("Sam", 14),
        Person("Bob", 21)
    ).asFlow()

    peopleFlow.transform { person ->
        if (person.age > 17) {
            emit(person.name)
        }
    }.collect { personName -> println(personName) }

data class Person(val name: String, val age: Int)

//    Tom
//    Bob