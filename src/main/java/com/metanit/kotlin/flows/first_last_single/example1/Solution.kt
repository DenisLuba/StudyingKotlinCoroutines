package com.metanit.kotlin.flows.first_last_single.example1

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = listOf("Tom", "Bob", "Kate", "Sam", "Alice").asFlow()
    val firstUser: String = userFlow.first()
    println("First user: $firstUser")
}

//    First user: Tom