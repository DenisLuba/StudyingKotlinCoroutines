package com.metanit.kotlin.flows.first_last_single.example4

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = listOf("Tom", "Bob", "Alice", "Sam").asFlow()
    val lastUser = userFlow.last()
    println("Last user: $lastUser")
}

//    Last user: Sam