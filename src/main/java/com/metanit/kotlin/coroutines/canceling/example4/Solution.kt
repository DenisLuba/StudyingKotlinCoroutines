package com.metanit.kotlin.coroutines.canceling.example4

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    // создаем и запускаем корутину
    val message = async {
        getMessage()
    }
    // отмена корутины
    message.cancelAndJoin()

    try {
        // ожидаем получение результата
        println("message: ${message.await()}")
    } catch (e: CancellationException) {
        println("Coroutine has been canceled")
    }

    println("Program has finished")
}

suspend fun getMessage(): String {
    delay(550L)
    return "Hello"
}

//  Coroutine has been canceled
//  Program has finished