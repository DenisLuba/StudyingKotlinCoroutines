package org.example.exampleBasic.exampleBasic02

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello, ")
    delay(1500L)
}