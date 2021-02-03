package com.example.helloworld

data class User(val id: Int,var name: String)
fun main(){
    val user1 = User(1,"Jackie")
    println(user1)
    //user1.name = "replace"
    val user2 = User(1,"jackie")
    println(user1.equals(user2))
}
