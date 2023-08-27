package com.metanit.kotlin.coroutines.asinc_await_deferred.example2

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    val message: Deferred<String> = async { getMessage() }
    println("message: ${message.await()}") // await возвращает в данном случае String
    println("Program has finished")
}
suspend fun getMessage(): String {
    delay(500L) // имитация продолжительной работы
    return "Hello"
}

//  message: Hello
//  Program has finished