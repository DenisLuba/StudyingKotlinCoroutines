package com.metanit.kotlin.flows.introduction.example4

import kotlinx.coroutines.flow.*

suspend fun main() {
    val numberFlow = getNumbers() // поток создан, но не запущен
    println("numberFlow has created")
    println("launch collect function")
    numberFlow.collect { number -> println(number) } // запуск потока
}

fun getNumbers() = flow {
    println("numberFlow has started")
    for (item in 1..5) {
        emit(item * item)
    }
}

//  numberFlow has created
//  launch collect function
//  numberFlow has started
//  1
//  4
//  9
//  16
//  25