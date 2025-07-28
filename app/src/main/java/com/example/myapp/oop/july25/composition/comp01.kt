package com.example.myapp.oop.july25.composition

fun main(){
 val address =Address("Sivas","Yildizeli")
    val contact= Contacts("Ali", 21,address)

    println("name : ${contact.name}")
    println("age : ${contact.age}")
    println("county : ${contact.address.county}")
    println("district : ${contact.address.district}")
}