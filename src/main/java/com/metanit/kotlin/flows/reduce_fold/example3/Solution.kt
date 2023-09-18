package com.metanit.kotlin.flows.reduce_fold.example3

import kotlinx.coroutines.flow.*

suspend fun main() {
    val userFlow: Flow<String> = listOf("Tom", "Bob", "Kate", "Sam", "Alice").asFlow()
    val foldedValue: String = userFlow.fold("Users: ", { a, b -> "$a $b" })
    println(foldedValue)
}

//    Users: Tom Bob Kate Sam Alice