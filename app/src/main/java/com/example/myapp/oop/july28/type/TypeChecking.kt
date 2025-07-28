package com.example.myapp.oop.july28.type

fun main() {
    val obj1= TypeChecking01()
    if (obj1 is TypeChecking01){
        println("Object 1 is an instance of TypeChecking01")
    }else
        println("object 1 is not an instance of TypeChecking01")
}