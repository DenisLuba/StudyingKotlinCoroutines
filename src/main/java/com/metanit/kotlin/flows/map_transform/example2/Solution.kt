package com.metanit.kotlin.flows.map_transform.example2

import kotlinx.coroutines.flow.*

suspend fun main() {

    val peopleFlow: Flow<Person> = listOf(
        Person("Tom", 37),
        Person("Bill", 5),
        Person("Sam", 14),
        Person("Bob", 21)
    ).asFlow()

    peopleFlow.map { person -> object {   // объект анонимного типа
        val name = person.name
        val isAdult = person.age > 17
    }}.collect { user -> println("name: ${user.name}   adult: ${user.isAdult}") }
}

data class Person(val name: String, val age: Int)

//    name: Tom    adult: true
//    name: Bill   adult: false
//    name: Sam   adult: false
//    name: Bob   adult: true