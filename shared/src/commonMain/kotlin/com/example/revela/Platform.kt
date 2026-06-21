package com.example.revela

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform