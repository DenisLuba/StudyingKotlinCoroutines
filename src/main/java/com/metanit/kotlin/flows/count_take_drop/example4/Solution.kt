package com.metanit.kotlin.flows.count_take_drop.example4

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = listOf("Tom", "Bob", "Kate", "Sam", "Alice").asFlow()
    userFlow.drop(3).collect { user -> println(user) }
}

//    Sam
//    Alice