package com.metanit.kotlin.coroutines.coroutine_scope.example4

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch {
        println("Other coroutine")
        launch {
            println("Inner coroutine")
            delay(400L)
        }
    }

    println("End of Main")
}

//  End of Main
//  Other coroutine
//  Inner coroutine