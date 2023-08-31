package com.metanit.kotlin.coroutines.channels.example4

/**
 *      Функция produce() представляет построитель корутины, который создает корутину, в которой передаются данные в канал.
 *
 *      Для потребления данных из канала может применяться метод consumeEach() объекта ReceiveChannel, который по сути
 *  заменяет цикл for.
 */

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.channels.consumeEach

suspend fun main() = coroutineScope {

    val users: ReceiveChannel<String> = getUsers()
    users.consumeEach { user -> println(user) }
    println("End")
}

// функция расширения для класса CoroutineScope

fun CoroutineScope.getUsers(): ReceiveChannel<String> = produce {
    val users = listOf("Tom", "Bob", "Sam")
    for (user in users) send(user) // отправляем данные в канал
}

//  Tom
//  Bob
//  Sam
//  End

