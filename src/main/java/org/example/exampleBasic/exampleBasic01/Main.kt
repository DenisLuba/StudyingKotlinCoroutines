package org.example.exampleBasic.exampleBasic01

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("Coroutines!")
    }

    println("Hello, ")

    Thread.sleep(1050L)
}
