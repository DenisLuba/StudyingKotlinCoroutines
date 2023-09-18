package com.metanit.kotlin.flows.reduce_fold.example1

import kotlinx.coroutines.flow.*

suspend fun main() {
    val numberFlow: Flow<Int> = listOf(1, 2, 3, 4, 5).asFlow()
    val reducedValue: Int = numberFlow.reduce { a, b -> a + b }
    println(reducedValue)
}

//    15