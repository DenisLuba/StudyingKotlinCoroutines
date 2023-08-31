package com.metanit.kotlin.coroutines.channels.example1

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

suspend fun main() = coroutineScope {

    val channel = Channel<Int>()
    launch {
        for (n in 1..5) {
            // отправляем данные через канал
            channel.send(n)
        }
    }

    // получаем данные из канала
    repeat(5) {
        val number = channel.receive()
        println(number)
    }
    println("End")
}

//  1
//  2
//  3
//  4
//  5
//  End