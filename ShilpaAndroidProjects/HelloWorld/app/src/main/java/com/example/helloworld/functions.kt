package com.example.helloworld

fun main (){

    println(powerOf(2.0,3.0))
    println(doubleOf(10))
    println(sumOf(1.0,2.0,3.0))

}
fun powerOf(a: Double,b: Double = 2.0)= Math.pow(a,b)

fun doubleOf(a: Int) = a * 2


fun sumOf(vararg numbers: Double): Double{
    var sum = 0.0
    for (i in numbers) {
        sum += i
    }
    return sum
}