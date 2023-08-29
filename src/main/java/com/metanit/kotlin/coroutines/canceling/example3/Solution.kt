package com.metanit.kotlin.coroutines.canceling.example3

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {

    val downloader: Job = launch {
        try {
            println("Начинаем загрузку файлов")
            for (i in 1..5) {
                println("Загружен файл $i")
                delay(500L)
            }
        } catch (e: CancellationException) {
            println("Загрузка файлов прервана")
        } finally {
            println("Загрузка завершена")
        }
    }
    delay(800L)
    println("Надоело ждать. Прерву-ка я загрузку...")
    downloader.cancelAndJoin() // отменяем корутину и ожидаем ее завершения
    println("Работа программы завершена")
}

//  Начинаем загрузку файлов
//  Загружен файл 1
//  Загружен файл 2
//  Надоело ждать. Прерву-ка я загрузку...
//  Загрузка файлов прервана
//  Загрузка завершена
//  Работа программы завершена