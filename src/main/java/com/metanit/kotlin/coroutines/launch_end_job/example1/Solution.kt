package com.metanit.kotlin.coroutines.launch_end_job.example1

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    val job: Job = launch {
        for (i in 5 downTo 1) {
            println(i)
            delay(400L)
        }
    }
    println("Start")
    job.join() // ожидаем завершения корутины
    println("End")
}

//  Start
//  5
//  4
//  3
//  2
//  1
//  End