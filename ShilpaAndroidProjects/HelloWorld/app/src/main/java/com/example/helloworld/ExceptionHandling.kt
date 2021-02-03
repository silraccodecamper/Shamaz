package com.example.helloworld

fun main() {
    val str = getNumber("10.5")
    println(str)
}

    fun getNumber(str: String): Int {
        return try{
            Integer.parseInt(str)
        }catch(e: ArithmeticException){
            0
        }
    }