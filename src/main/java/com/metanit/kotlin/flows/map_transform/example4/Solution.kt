package com.metanit.kotlin.flows.map_transform.example4

import kotlinx.coroutines.flow.*

suspend fun main() {

    val numbersFlow = listOf(2, 3, 4).asFlow()
    numbersFlow.transform { n ->
        emit(n)
        emit(n * n)
    }.collect { n -> println(n) }
}

//    2
//    4
//    3
//    9
//    4
//    16