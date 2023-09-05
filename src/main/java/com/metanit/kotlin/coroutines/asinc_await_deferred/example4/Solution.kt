package com.metanit.kotlin.coroutines.asinc_await_deferred.example4

/**
 *      По умолчанию построитель корутин async создает и сразу же запускает корутину. Но, как и при создании корутины с
 *  помощью launch, для async-корутин можно применять технику отложенного запуска. Но в данном случае корутина запускается
 *  не только при вызове метода start объекта Deferred, но и с помощью метода await() при обращении к результату корутины.
 */

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    // корутина создана, но не запущена
    val sum = async(start = CoroutineStart.LAZY) { sum(1, 2) }

    delay(1000L)
    println("Action after the coroutine creation")
    println("sum: ${sum.await()}") // запуск и выполнение корутины
}

fun sum(a: Int, b: Int): Int {
    println("Coroutine has started")
    return a + b
}

//  Action after the coroutine creation
//  Coroutine has started
//  sum: 3