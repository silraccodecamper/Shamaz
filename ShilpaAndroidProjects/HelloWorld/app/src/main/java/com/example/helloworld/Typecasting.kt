package com.example.helloworld

import kotlin.math.floor

fun main() {
    val stringList: List<String> = listOf(
    "one","two","three")
    val mixedTypeList: List<Any> = listOf("1",2.0,1,"one")


    for(value in mixedTypeList){
        when(value) {
            is Int -> println("integer: $value")
            is Double -> println(" Its a double: $value of floor ${floor(value)}")
            is String -> println("Its a string: $value with length ${value.length}")
            else -> println("unknown type")
        }
    }
}