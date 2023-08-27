package org.example.exampleBasic04

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch {
        delay(1000L)
        println("World!")
    }

    println("Hello, ")
}