package com.metanit.kotlin.coroutines.asinc_await_deferred.example5

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    // корутина создана, но не запущена
    val sum = async(start = CoroutineStart.LAZY) { sum(1, 2) }

    delay(1000L)
    println("Actions after the coroutine creation")
    sum.start()                    // запуск корутины
    delay(200L)
    println("After started of coroutine")
    println("sum: ${sum.await()}") // получаем результат
}
fun sum(a: Int, b: Int): Int {
    println("Coroutine has started")
    return a + b
}

//  Actions after the coroutine creation
//  Coroutine has started
//  After started of coroutine
//  sum: 3