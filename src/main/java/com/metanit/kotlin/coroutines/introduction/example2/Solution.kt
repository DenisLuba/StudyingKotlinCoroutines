package com.metanit.kotlin.coroutines.introduction.example2

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch {
        for (i in 0..5) {
            delay(400L)
            println(i)
        }
    }

    println("Hello Coroutines")
}

//  Hello Coroutines
//  0
//  1
//  2
//  3
//  4
//  5