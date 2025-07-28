package com.example.myapp.oop.july25.inheritance

open class Car(
    var type: String="Sedan",
    color:String="White",
    gear :String="Manual"
): Vehicle(color,gear){
}