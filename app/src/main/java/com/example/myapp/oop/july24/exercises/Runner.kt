package com.example.myapp.oop.july24.exercises

import java.util.Scanner

fun main() {
    var input= Scanner(System.`in`)
    println("\nplease enter the degree")
    val degree=input.nextDouble()
    println("\nthe fahrenheit of given value is : ${converter(degree)}")

    println("\nplease enter the side a of rectangle")
    val side1=input.nextInt()
    println("\nplease enter the side b of rectangle")
    val side2=input.nextInt()

    println("the rectangles perimeter is : ${perimeter(side1,side2)}")

    println("enter the number to take factorial")
    val factorial=input.nextInt()
    println("the factorial of given number is : ${factorial(factorial)}")

    println("enter the word")
    val word=input.next()
    println("enter the letter")
    val ch=input.next()[0]

    println("the letter $ch is have ${wordCount(word,ch)} appearances in word $word")
}