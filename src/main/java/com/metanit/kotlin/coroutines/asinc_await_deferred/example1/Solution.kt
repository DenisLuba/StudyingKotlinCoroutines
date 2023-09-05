package com.metanit.kotlin.coroutines.asinc_await_deferred.example1

/**
 *      launch() запускают, когда не нужен результат, а лишь параллельное выполнение. async() - функция, работающая параллельно,
 *  но возвращающая результат - объект Deferred, который типизируется возвращаемым типом (например, Deferred<String>).
 *  Он унаследован от Job, поэтому для него также доступен весь функционал, определенный для Job.
 *      Для получения результата из объекта Deferred применяется функция await().
 */

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {

    async {printHello() }

    println("Program has finished")
}

suspend fun printHello() {
    delay(500L) // имитация продолжительной работы
    println("Hello work!")
}

//  Program has finished
//  Hello work!