package com.metanit.kotlin.flows.filter.example2

import kotlinx.coroutines.flow.*

suspend fun main() {
    val peopleFlow = listOf(
        Person("Tom", 37),
        Person("Alice", 32),
        Person("Bill", 5),
        Person("Sam", 14),
        Person("Bob", 21)
    ).asFlow()

    peopleFlow.takeWhile { person -> person.age > 17 }
        .collect { person -> println("name: ${person.name} age: ${person.age}") }
}

data class Person(val name: String, val age: Int)

//    name: Tom age: 37
//    name: Alice age: 32