package com.metanit.kotlin.coroutines.coroutine_dispatcher.example1.example2

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch(Dispatchers.Unconfined) {
        println("Поток корутины (до остановки): ${Thread.currentThread().name}")
        delay(500L)
        println("Поток корутины (после остановки): ${Thread.currentThread().name}")
    }
    println("Поток функции main: ${Thread.currentThread().name}")
}

//  Поток корутины (до остановки): main
//  Поток функции main: main
//  Поток корутины (после остановки): kotlinx.coroutines.DefaultExecutor