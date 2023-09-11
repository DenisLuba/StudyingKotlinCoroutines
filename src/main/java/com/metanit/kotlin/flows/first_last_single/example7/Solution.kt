package com.metanit.kotlin.flows.first_last_single.example7

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = listOf("Tom", "Bob").asFlow()
    val singleUser: String? = userFlow.singleOrNull()
    if (singleUser != null) println("Single user: $singleUser")
    else println("Not found")
}

// Not found