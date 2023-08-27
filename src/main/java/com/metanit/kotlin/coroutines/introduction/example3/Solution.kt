package com.metanit.kotlin.coroutines.introduction.example3

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch { doWork() }

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
}