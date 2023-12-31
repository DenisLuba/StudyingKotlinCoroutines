package com.metanit.kotlin.coroutines.introduction.example1

import kotlinx.coroutines.*

/**
        Между корутинами и потоками нет прямого соответствия. Когда корутина приостанавливает свое выполнение, например,
    при вызове задержки (delay()), эта корутина освобождает поток, в котором она выполнялась, и сохраняется в памяти.
    А освобожденный поток может быть задействован для других задач. А, когда завершается запущенная в корутине задача,
    корутина возобновляет свою работу в одном из свободных потоков.
 */

suspend fun main() {
    for (i in 0..5) {
        delay(400L)
        println(i)
    }

    println("Hello Coroutines")
}

//  0
//  1
//  2
//  3
//  4
//  5
//  Hello Coroutines