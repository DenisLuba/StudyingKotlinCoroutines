package com.metanit.kotlin.coroutines.coroutine_scope.example1

/**
 *      Корутина может выполняться только в определенной области корутины (coroutine scope). Область корутин представляет
 *  пространство, в рамках которого действуют корутины. Она имеет определенный жизненный цикл и сама управляет жизненным
 *  циклом создаваемых внутри нее корутин.
 *
 *      Для создания области корутин в Kotlin может использоваться ряд функций, которые создают объект интерфейса
 *  CoroutineScope.
 */

import kotlinx.coroutines.*

suspend fun main() {
    doWork()
    println(Thread.currentThread().name)
    println("Hello Coroutines")
}

suspend fun doWork() = coroutineScope { // this: CoroutineScope
    launch { // this: CoroutineScope
        for (i in 0..5) {
            println(i)
            delay(400L)
        }
        println(Thread.currentThread().name)
    }
}

//  0
//  1
//  2
//  3
//  4
//  5
//  DefaultDispatcher-worker-1
//  DefaultDispatcher-worker-1
//  Hello Coroutines