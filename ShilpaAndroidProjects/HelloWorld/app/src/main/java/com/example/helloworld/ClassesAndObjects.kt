package com.example.helloworld

fun main(){
    var Samsung = MobilePhone("Android10", "Samsung","galaxy S20 Ultra",20)
    var pixel = MobilePhone("Android 9","Pixel","mega",50)
    var iPhone = MobilePhone("Iphone10","Apple", "IphoneX",10)

    var myCar = Car()
    println("brand ${myCar.myBrand}")
    println("My car model is ${myCar.myModel}")
    myCar.maxSpeed = -2
    println("speed of the car is ${myCar.maxSpeed}")



}
class MobilePhone(osName: String,brand: String,model: String,batteryLife: Int){
    init{
        println("OS name = $osName , brand name = $brand , model = $model, battery life = $batteryLife")
    }
    fun chargeBattery(chargedBy: Int){
    println("The ")
    }

}



class Car(){
    lateinit var owner : String

    val myBrand: String = "BMW"
    get() {
        return field.toLowerCase()
    }

    var maxSpeed: Int = 250

    set(value){
        field = if(value > 0) value else throw IllegalArgumentException("Max speed cannot be less than zero")
    }

    var myModel: String = "MS"
    private set
    init {
        this.owner = "Frank"
        this.myModel = "Benz"
    }

}