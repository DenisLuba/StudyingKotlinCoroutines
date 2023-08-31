package com.metanit.kotlin.coroutines.channels.example3

/**
 *      Если для получения данных из канала применяется цикл for, то, получив сигнал о закрытии канала, данный цикл получит
 *  все ранее посланные объекты до закрытия и завершит выполнение.
 */

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel 

suspend fun main() = coroutineScope {

    val channel = Channel<String>()
    launch {
        val users = listOf("Tom", "Bob", "Sam")
        for (user in users) {
            channel.send(user) // Отправляем данные в канал
        }
        channel.close() // Закрытие канала
    }

    for (user in channel) {  // Получаем данные из канала
        println(user)
    }
    println("End")
}

//  Tom
//  Bob
//  Sam
//  End