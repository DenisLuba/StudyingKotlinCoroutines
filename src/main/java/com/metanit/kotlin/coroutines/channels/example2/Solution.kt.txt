package com.metanit.kotlin.coroutines.channels.example2

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

suspend fun main() = coroutineScope {
    
    val channel = Channel<String>()
    launch {
        val users = listOf("Tom", "Bob", "Sam")
        for (user in users) {  
            println("Sending: $user")
            channel.send(user)
        }
    }

    repeat(3) {
        val user = channel.receive()
        println("Received: $user")
    }
    println("End")
}

// Sending: Tom
// Received: Tom
// Sending: Bob
// Received: Bob
// Sending: Sam
// Received: Sam
// End