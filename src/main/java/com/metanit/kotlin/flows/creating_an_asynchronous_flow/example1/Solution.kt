package com.metanit.kotlin.flows.creating_an_asynchronous_flow.example1

/**
 *     Для создания асинхронного потока можно применять различные способы. Рассмотрим три основных способа.
 *     
 *     Функция-построитель потока flow() позволяет задать логику передачи объектов в поток.
 * 
 *     Специальная функция-строитель flowOf() создает поток из набора переданных в функцию значений.
 * 
 *     Стандартные коллекции и последовательности в Kotlin имеют метод расширения asFlow(), который позволяет 
 * преобразовать коллекцию или последовательность в поток.
 */

import kotlinx.coroutines.flow.*

suspend fun main() {

    val numberFlow = getNumbers()
    numberFlow.collect { n -> println(n) }
}

fun getNumbers() = flow {
    for (item in 1..5) {
        emit(item * item)
    }
}

//    1
//    2
//    3
//    4
//    5