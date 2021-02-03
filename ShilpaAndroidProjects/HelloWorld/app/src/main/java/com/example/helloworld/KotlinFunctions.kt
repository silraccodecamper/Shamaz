package com.example.helloworld

fun main(){

    var averageOf2 = average(2.0,3.0)
    println("$averageOf2")



    var nullableName2: String? = "Dennis"
    println(nullableName2?.length)
    nullableName2 = null
//elvis operator ?:= null
    val name = nullableName2?: "Guest"
    println("Name is $name")


    /*if(nullableName2 != null) {
        println("Hello, ${nullableName2.toLowerCase()}.")
        println("Your name is ${nullableName2.length} characters long.")
    } else {
        println("Hello, Guest")
    }*/


}

fun average(a: Double, b: Double): Double{
    return a+b/2.0
}