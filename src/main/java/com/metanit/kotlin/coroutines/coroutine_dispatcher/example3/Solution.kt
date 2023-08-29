package com.metanit.kotlin.coroutines.coroutine_dispatcher.example3

/**
 *      newSingleThreadContext вручную запускает поток с указанным именем.
 *  В то же время выделенный поток является довольно затратным ресурсом. И в реальном приложении подобый поток следует
 *  либо освобождать с помощью функции close(), если он больше не нужен, либо хранить в глобальной переменной и
 *  использовать его повторно для подобных задач на протяжении работы приложения.
 */

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch(newSingleThreadContext("Custom Thread")) {
        println("Поток корутины: ${Thread.currentThread().name}")
    }
    println("Поток функции main: ${Thread.currentThread().name}")
}

//  Поток функции main: main
//  Поток корутины: Custom Thread