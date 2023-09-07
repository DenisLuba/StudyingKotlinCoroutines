package com.metanit.kotlin.flows.first_last_single.example2

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = listOf("Tom", "Bob", "Kate", "Sam", "Alice").asFlow()
    val firstUser: String = userFlow.first { name -> name.lenght > 3 }
    println("First user: $firstUser")
}

//    First user: Kate