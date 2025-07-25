package com.example.myapp.oop.july24

infix fun Int.product(number:Int):Int{
    return this +number
}
fun main() {
    val result= 8.product(7)// same as 8+7
    println(result)
    val result1= 8 product 7 // also same as 8+7
    println(result1)//15
}