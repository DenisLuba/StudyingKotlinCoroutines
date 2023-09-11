package com.metanit.kotlin.flows.first_last_single.example6

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = listOf("Tom").asFlow()
    try {
        val singleUser: String = userFlow.single()
        println("Single user: $singleUser")
    } catch(e: Exception) { println(e.message) }
}

// Single user: Tom