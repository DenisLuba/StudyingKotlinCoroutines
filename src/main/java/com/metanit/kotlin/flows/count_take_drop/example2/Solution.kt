package com.metanit.kotlin.flows.count_take_drop.example2

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = listOf("Tom", "Bob", "Kate", "Sam", "Alice").asFlow()
    val count: Int = userFlow.count { username -> username.length > 3 }
    println("Count: $count")
}

//    Count: 2