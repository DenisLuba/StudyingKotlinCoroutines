package com.metanit.kotlin.flows.zip.example2

import kotlinx.coroutines.flow.*

suspend fun main() {
    val names: Flow<String> = listOf("Tom", "Bob", "Sam").asFlow()
    val ages: Flow<Int> = listOf(37, 41, 25).asFlow()
    names.zip(ages) { name, age -> Person(name, age) }
        .collect { person -> println("Name: ${person.name} Age: ${person.age}") }
}

data class Person(val name: String, val age: Int)