package com.example.myapp.oop.july23

import java.util.Scanner



fun main() {
    val input = Scanner(System.`in`)

    println("how many numbers you want to enter for summing?")
    val count = input.nextInt()


    val numbers = IntArray(count)


    for (i in 0 until count) {
        print("Number ${i + 1}: ")
        numbers[i] = input.nextInt()
    }


    println("The sum of Numbers are: ${sum(*numbers)}")
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }
    return result
}

