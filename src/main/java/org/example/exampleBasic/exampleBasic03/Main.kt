package org.example.exampleBasic.exampleBasic03

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello, ")
    job.join()
}