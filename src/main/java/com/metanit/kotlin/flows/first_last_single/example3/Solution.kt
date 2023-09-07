package com.metanit.kotlin.flows.first_last_single.example3

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = listOf<String>().asFlow()
    val firstUser1: String? = userFlow.firstOrNull()
    val firstUser2: String? = userFlow.firstOfNull { name -> name.lenght > 3 }

    if (firstUser1 == null) println("User not found")
    else println("First user: $firstUser1")

    if (firstUser2 == null) println("User not found")
    else println("First user: $firstUser2")
}

//    User not found
//    User not found