package com.metanit.kotlin.flows.introduction.example3

import kotlinx.coroutines.flow.*

suspend fun main() {
    getNumbers().collect { number -> println(number) }
}

fun getNumbers(): Flow<Int> = flow {
    for (item in 1..5) {
        emit(item * item)
    }
}

//  1
//  4
//  9
//  16
//  25