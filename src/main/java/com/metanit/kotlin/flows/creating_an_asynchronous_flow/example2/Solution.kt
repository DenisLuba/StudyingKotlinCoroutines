package com.metanit.kotlin.flows.creating_an_asynchronous_flow.example2

import kotlinx.coroutines.flow.*

suspend fun main() {

    val userFlow: Flow<String> = flow {
        val usersList = listOf("Tom", "Bob", "Sam")
        for (item in usersList) {
            emit(item)
        }
    }

    userFlow.collect { user -> println(user) } 
}

//    Tom
//    Bob
//    Sam