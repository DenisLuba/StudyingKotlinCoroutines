package com.metanit.kotlin.flows.filter.example3

import kotlinx.coroutines.flow.*

suspend fun main() {
    val peopleFlow = listOf(
        Person("Tom", 37),
        Person("Alice", 32),
        Person("Bill", 5),
        Person("Sam", 14),
        Person("Bob", 21)
    ).asFlow()

    peopleFlow.dropWhile { person -> person.age > 17 }
        .collect { person -> println("name: ${person.name} age: ${person.age}") }
}

data class Person(val name: String, val age: Int)

//    name: Bill age: 5
//    name: Sam age: 14
//    name: Bob age: 21