package com.example.myapp.oop.july23

fun main() {

    var car1= Car("blue","opel",3)
    var car2= Car("white", capacity = 5)
    var car3= Car("red","honda",7)
    var car4= Car("black")

    car1.getInfo()
    car2.getInfo()
    car3.getInfo()
    car4.getInfo()

    var x=null// no error due to not specified data type
    // but also cannot be changeable to any other value than null
    var d: String?=null // needed ? due to data type specified
    lateinit var car5: Car // does the same with var car5: Car? = null
    //lateinit only usable with objects.


}