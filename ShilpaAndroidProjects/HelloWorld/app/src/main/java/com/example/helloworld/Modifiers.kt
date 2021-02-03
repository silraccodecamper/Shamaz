package com.example.helloworld

open class Base(){
    var a = 1
    private val b = 2
    protected open val c = 3
    internal val d = 4
    protected fun e(){
    }
}

class Derived: Base() {
    override val c = 9
}

fun main(args:Array<String>){
    val base = Base()
    val derived = Derived()

}