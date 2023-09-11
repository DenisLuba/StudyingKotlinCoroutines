package com.metanit.kotlin.flows.count_take_drop.example1

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = listOf("Tom", "Bob", "Kate").asFlow()
    println("Count: ${userFlow.count()}")
}

//    Count: 3