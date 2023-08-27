package com.metanit.kotlin.coroutines.asinc_await_deferred.example3

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    val numDeferred1: Deferred<Int> = async { sum(1, 2) }
    val numDeferred2: Deferred<Int> = async { sum(3, 4) }
    val numDeferred3: Deferred<Int> = async { sum(5, 6) }
    val num1: Int = numDeferred1.await()
    val num2: Int = numDeferred2.await()
    val num3: Int = numDeferred3.await()

    println("number1: $num1 number2: $num2 number3: $num3")
}

suspend fun sum(a: Int, b: Int): Int {
    delay(500L) // имитация продолжительной работы
    return a + b
}

//  number1: 3 number2: 7 number3: 11