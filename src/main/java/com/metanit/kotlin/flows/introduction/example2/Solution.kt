package com.metanit.kotlin.flows.introduction.example2

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main() {
    getUsers().collect { user -> println(user) }
}

fun getUsers(): Flow<String> = flow {
    val database = listOf("Tom", "Bob", "Sam") // условная база данных
    var i = 1
    for (item in database) {
        delay(400L) // имитация продолжительной работы
        println("Emit $i item")
        emit(item) // емитируем значение
        i++
    }
}

//  Emit 1 item
//  Tom
//  Emit 2 item
//  Bob
//  Emit 3 item
//  Sam