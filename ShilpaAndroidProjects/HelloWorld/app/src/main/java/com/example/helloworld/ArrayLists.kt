package com.example.helloworld
fun main(){
    var myArrayList = ArrayList<Double>(5)
    myArrayList.add(2.0)
    myArrayList.add(3.5666)
    myArrayList.add(6.5)
    myArrayList.add(7.5)
    myArrayList.add(9.0)
    myArrayList.add(6.0)
    var total = 0.0

    for (i in myArrayList) {
        total += i

    }
    var average = total/myArrayList.size
    println("Average = $average")




    fun addNumber(a: Int,b:Int){
        var sum = a + b
        print("Sum = $sum")
    }
    addNumber(5,10)

    val sum: (Int,Int) -> Int = {a: Int,b: Int -> a + b}


    fun checkElement(){
        var arry1 = arrayOf(1,2,3,4)
        val checkNum = 3

        for(i in arry1){
            if(arry1[i] == checkNum){
                println("number exists")
            }else {
                println("number doesn't exists")
            }
        }

    }
    checkElement()

}

