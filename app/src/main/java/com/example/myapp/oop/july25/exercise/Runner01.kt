package com.example.myapp.oop.july25.exercise

import java.util.Scanner

fun main() {
    val input=Scanner(System.`in`)

    println("please enter the side count of shape")
    val sideCount= input.nextInt()
    println("the sum of angles is : ${degreeSum(sideCount)}")


    println("\nplease enter the total days worked")
    val daysWorked=input.nextInt()
    println("\nyour wage this month is: ${wageCalc(daysWorked)}$")

    println("\n please enter the internet you used this month")
    val quota=input.nextInt()
    println("\n your payment this month is : ${quotaCalc(quota)}$")

}