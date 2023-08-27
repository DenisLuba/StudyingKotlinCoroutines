package com.metanit.kotlin.coroutines.coroutine_scope.example3

/**
 *      Функция runBlocking блокирует вызывающий поток, пока все корутины внутри вызова runBlocking{...} не завершат свое
 *  выполнение. В отличие от coroutineScope: coroutineScope не блокирует вызывающий поток, а просто приостанавливает свое
 *  выполнение, освобождая поток для использования другими ресурсами.
 */

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        for (i in 0..5) {
            println(i)
            delay(400L)

        }
    }

    delay(5L)
    println("Hello Coroutines")
}

//0
//Hello Coroutines
//1
//2
//3
//4
//5