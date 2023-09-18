package com.metanit.kotlin.flows.reduce_fold.example2

import kotlinx.coroutines.flow.*

suspend fun main() {
    val userFlow: Flow<String> = listOf("Tom", "Bob", "Kate", "Sam", "Alice").asFlow()
    val reducedValue: String = userFlow.reduce { a, b -> "$a $b" }
    println(reducedValue)
}

//    Tom Bob Kate Sam Alice