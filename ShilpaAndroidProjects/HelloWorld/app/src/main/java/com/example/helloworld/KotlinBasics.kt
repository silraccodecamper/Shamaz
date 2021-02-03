package com.example.helloworld

fun main(){
    myFunction();
    //TODO: Add new functionality
    /*
    multiline comment
    line
     */
    var myName = "Shilpa"
    myName = "Jacie"
    var myAge = 38

    //Strings
    val myStr = "Hello World"
    var firstChar = myStr[0]
    var lastChar = myStr[myStr.length - 1]
    print(firstChar)
    print(lastChar)

    print("Hello " + myName)

    //Exercise 1
    var title: String = "Android Masterclass"

    var myFloat: Float = 13.37F

    var myDouble: Double = 3.14159265358979

    var myByte: Byte = 25

    var myInt1: Short = 2020

    var myInt2: Long = 18881234567

    var myBool: Boolean = true

    var myChar: Char = 'a'

    //Arithmatic operators
    var  result = 5 + 4
    val a = 10.0
    val b = 3
    var resultDouble: Double
    //resultDouble = a / b
    result = (a/b).toInt()
    //result %= 4
    print(result)
    //print(resultDouble)

    //comparision operators
    val isEqual = 5 != 3

    //String INTERPOLATION
    println("\n isEqual is $isEqual")
    println("isEqual is ${5 > 3}")


    //Increment decrement
    var myNum = 5
    myNum += 3
    myNum *= 4
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum++}")

    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")
    println("myNum is ${myNum--}")

    //If else statements
    var age = 21
    if(age >= 21){
        println("You may drink in US")
    } else if(age >= 18){
        println("You can vote")
    } else if(age >= 16){
        println("you can drive")
    }else{
        println("you are too young")
    }

    var age1 = 21
    when(age1){
        !in 1..20 -> println("You may drink")
        in 18 .. 20 -> println("you CAN VOTE")
        16, 17 -> println("you can drive")

    }

    var x : Any = 33
    when (x){
        is Double -> println("$x is Double")
        is Int -> print("$x is Int")
        else -> println("$x is not any of the above")
    }
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Autumn")
        3 -> {
            println("fall")
            println("Autumn")
        }
        4 -> println("winter")
        else -> println("invalid season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid month value")
    }


    //While condition
    var x1 = 100
    while(x1 >= 10) {
        println("$x1")
        x1--
    }
println("\nWhile loop is done")


    //Do while loop don't check the condition before execute once
    var x2 = 1
    do {
        println("$x2")
        x2++

      }while(x2 >=10)
    println("do while loops done")


    //example usage of do while loops
    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("Its comfy now")
        }
    }

    //For loops
    for(num in 1..10){
        println("$num")
    }
    for( i in 1 until 10){
        print("$i")
    }
    print("\n@@@@@@@@@@@\n")
    for(i1 in 10 downTo 1){
        print("$i1")
    }

    for(i3 in 8 downTo 1 step 2){
        print("$i3")
    }


    //Exercise loops Write a for loop that runs from 0 to 10000
    //Once it's at 9001 it should write "IT'S OVER 9000!!!"

    for(num1 in 0 until 10000 ){
        if(num1 == 9001){
            print("IT'S OVER 9000!!!")

        }
    }

    //Write a while loop that checks the humidity (not the humidityLevel). The variable humidityLevel starts at 80.
    // The variable humidity is initialized with "humid".
    // If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
    //Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"
    var humidity = "humid"
    var humidityLevel = 80
    while(humidity== "humid"){
        humidityLevel -= 5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "Comfy"
            println("Its comfy now")

        }

        var x4 = 0
        for (y in 0..9) {
            x4 += y
            print("$x4")
            print("$y")
        }

        println("$x4")
    }
}

fun myFunction(){
    print("Called muFunction")
}


