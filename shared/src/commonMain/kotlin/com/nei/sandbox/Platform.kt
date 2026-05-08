package com.nei.sandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform