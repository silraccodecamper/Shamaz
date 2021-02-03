package com.example.helloworld


interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("the drivable is braking")
    }

}
// super class of electric car
open class Car1(override val maxSpeed: Double,val name: String, val brand: String): Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount

    }
    // this is the simple form of the below code override fun drive(): String = "this drive is from interface module"
    override fun drive(): String {
        return "this drive is from interface module"
    }
    open fun drive(distance: Double){
        println("drove  for $distance km")
    }
}

class ElectricCar(override val maxSpeed: Double,name: String, brand: String, batteryLife: Double): Car1(maxSpeed,name,brand){
    var chargerType = "Type1"
    override var range = batteryLife * 4
    override fun drive(distance: Double) {
       println("Drove for $distance")
    }
}
fun main(){
    var myCar = Car1(200.0,"a3","audi")
    var myTeslaS = ElectricCar(500.0,"s","tesla",75.0)
    myCar.drive(200.0)
    myTeslaS.drive(50.0)
}