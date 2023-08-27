package com.metanit.kotlin.coroutines.launch_end_job.example2

/**
 *      По умолчанию построитель корутин launch создает и сразу же запускает корутину. Однако Kotlin также позволяет
 *  применять технику отложенного запуска корутины (lazy-запуск), при котором корутина запускается при вызове метода
 *  start() объекта Job.
 *
 *      Для установки отложенного запуска в функцию launch() передается значение start = CoroutineStart.LAZY
 */

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {

    // корутина создана, но не запущена
    val job: Job = launch(start = CoroutineStart.LAZY) {
        delay(200L)
        println("Coroutine has started")
    }

    delay(1000L)
    job.start() // запускаем корутину
    println("Other actions in main method")
}

//  Other actions in main method
//  Coroutine has started