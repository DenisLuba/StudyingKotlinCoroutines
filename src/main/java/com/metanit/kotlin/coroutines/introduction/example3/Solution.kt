package com.metanit.kotlin.coroutines.introduction.example3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.produce

suspend fun main() = coroutineScope {
    launch { doWork() }

    println(Thread.currentThread().name)
    println("Hello Coroutines")
}

//suspend fun main() = coroutineScope {
//    launch { doWork() }
//
//    Unit // возвращаем Unit
//}
//
//suspend fun main() = coroutineScope<Unit> { // типизируем функцию coroutineScope типом Unit
//    launch { doWork() }
//}

suspend fun doWork() {
    for (i in 0..5) {
        println(i)
        delay(400L)
    }
    println(Thread.currentThread().name)
}

//  main
//  Hello Coroutines
//  0
//  1
//  2
//  3
//  4
//  5
//  DefaultDispatcher-worker-1