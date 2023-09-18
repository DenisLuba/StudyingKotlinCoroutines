package com.metanit.kotlin.flows.zip.example1

import kotlinx.coroutines.flow.*

suspend fun main() {
    val english: Flow<String> = listOf("red", "yellow", "blue").asFlow()
    val russian: Flow<String> = listOf("красный", "желтый", "синий").asFlow()
    english.zip(russian) { a, b -> "$a: $b" }
        .collect { word -> println(word) }
}

//    red: красный
//    yellow: желтый
//    blue: синий