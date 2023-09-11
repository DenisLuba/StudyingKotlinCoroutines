package com.metanit.kotlin.flows.count_take_drop.example3

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = listOf("Tom", "Bob", "Kate", "Sam", "Alice").asFlow()
    userFlow.take(3).collect { user -> println(user) }
}

//    Tom
//    Bob
//    Kate