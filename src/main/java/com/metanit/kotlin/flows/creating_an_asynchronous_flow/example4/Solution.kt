package com.metanit.kotlin.flows.creating_an_asynchronous_flow.example4

import kotlinx.coroutines.flow.*

suspend fun main() {
    
    val numberFlow: Flow<String> = flowOf("Tom", "Sam", "Bob")
    numberFlow.collect { user -> println(user) }
}

//    Tom
//    Sam
//    Bom