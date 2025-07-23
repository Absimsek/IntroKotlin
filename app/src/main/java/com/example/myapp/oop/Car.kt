package com.example.myapp.oop

class Car (var colour: String= "White" ,var brand: String="Toyota",var capacity: Int=4) {

    fun getInfo(){
        println("\ncolor = $colour")
        println("brand = $brand")
        println("capacity = $capacity ")
    }


}