package com.metanit.kotlin.flows.creating_an_asynchronous_flow.example3

import kotlinx.coroutines.flow.*

suspend fun main() {
    
    val numberFlow: Flow<Int> = flowOf(1, 2, 3, 5, 8)
    numberFlow.collect { n -> println(n) }
}

//    1
//    2
//    3
//    5
//    8