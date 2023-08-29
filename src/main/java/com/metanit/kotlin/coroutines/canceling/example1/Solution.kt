package com.metanit.kotlin.coroutines.canceling.example1

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {

    val downloader: Job = launch {
        println("Начинаем загрузку файлов")
        for (i in 1..5) {
            println("Загружаем файл $1")
            delay(500L)
        }
    }
    delay(800L) // установим задержку, чтобы несколько файлов загрузились
    println("Надоело ждать, пока все файлы загрузятся. Прерву-ка я загрузку...")
    downloader.cancel() // отменяем корутину
    downloader.join() // ожидаем завершения корутины
    println("Работа программы завершена")
}

//  Начинаем загрузку файлов
//  Загружаем файл $1
//  Загружаем файл $1
//  Надоело ждать, пока все файлы загрузятся. Прерву-ка я загрузку...
//  Работа программы завершена