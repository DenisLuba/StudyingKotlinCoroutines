package com.metanit.kotlin.flows.filter.example1

import kotlinx.coroutines.flow.*

suspend fun main() {
    val peopleFlow = listOf(
        Person("Tom", 37),
        Person("Bill", 5),
        Person("Sam", 14),
        Person("Bob", 21)
    ).asFlow()

    peopleFlow.filter { person -> person.age > 17 }
        .collect { person -> println("name: ${person.name} age: ${person.age}") }
}

data class Person(val name: String, val age: Int)

//    name: Tom age: 37
//    name: Bob age: 21