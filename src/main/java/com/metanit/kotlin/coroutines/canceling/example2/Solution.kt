package com.metanit.kotlin.coroutines.canceling.example2

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {

    val downloader: Job = launch {
        println("Начинаем загрузку файлов")
        for (i in 1..5) {
            println("Загружаем файл")
            delay(500L)
        }
    }
    delay(800L)
    println("Надоело ждать, пока все файлы загрузятся. Прерву-ка я загрузку...")
    downloader.cancelAndJoin() // отменяем корутину и ожидаем ее завершения
    println("Работа программы завершена")
}

//  Начинаем загрузку файлов
//  Загружаем файл
//  Загружаем файл
//  Надоело ждать, пока все файлы загрузятся. Прерву-ка я загрузку...
//  Работа программы завершена