package com.metanit.kotlin.coroutines.coroutine_scope.example2

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch {
        for (i in 0..5) {
            delay(400L)
            println(i)
        }
    }

    launch {
        for (i in 6..10) {
            delay(400L)
            println(i)
        }
    }

    println("Hello Coroutines")
}

//Hello Coroutines
//6
//0
//7
//1
//8
//2
//3
//9
//4
//10
//5