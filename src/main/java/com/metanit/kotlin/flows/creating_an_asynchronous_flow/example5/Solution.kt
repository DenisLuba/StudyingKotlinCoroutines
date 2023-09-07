package com.metanit.kotlin.flows.creating_an_asynchronous_flow.example5

import kotlinx.coroutines.flow.*

suspend fun main() {
    // преобразование последовательности в поток
    val numberFlow: Flow<Int> = (1..5).asFlow()
    numberFlow.collect { n -> println(n) }

    // преобразование коллекции List<String> в поток
    val userFlow: Flow<String> = listOf("Tom", "Sam", "Bob").asFlow()
    userFlow.collect { user -> println(user) }
}

//    1
//    2
//    3
//    4
//    5
//    Tom
//    Sam
//    Bob