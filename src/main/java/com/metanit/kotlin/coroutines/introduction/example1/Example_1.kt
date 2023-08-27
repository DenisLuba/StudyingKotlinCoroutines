package com.metanit.kotlin.coroutines.introduction.example1

import kotlinx.coroutines.*

suspend fun main() {
    for (i in 0..5) {
        delay(400L)
        println(i)
    }

    println("Hello Coroutines")
}