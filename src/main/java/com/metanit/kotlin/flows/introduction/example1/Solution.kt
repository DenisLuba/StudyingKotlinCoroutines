package com.metanit.kotlin.flows.introduction.example1

import kotlinx.coroutines.*

suspend fun main() = coroutineScope<Unit> {
    launch {
        getUsers().forEach { user -> println(user) }
    }
}

suspend fun getUsers(): List<String> {
    delay(1000L) // имитация продолжительной работы
    return listOf("Tom", "Bob", "Sam")
}

//  Tom
//  Bob
//  Sam