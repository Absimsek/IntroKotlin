package com.example.myapp.oop.july24.exercises
// create a function which converts celcius into fahrenheit fahrenheit = celcius * 1.8 + 32

fun converter(degree: Double): Double{
return (degree*(1.8)) +32
}
// create a method which calculate the perimeter of a rectangle

fun perimeter(a:Int,b:Int): Int {
    return a*2 + b*2
}
// create a method which takes the factorial of given number
fun factorial(f:Int) :Int{
    var result=1
    for (i in f downTo  1){
        result *= i
    }
    return result
}
// create a method which counts the letter given in a given word

fun  wordCount(wordGiven:String,letterGiven:Char): Int{
    var count = 0
    for (ch in wordGiven) {
        if (ch == letterGiven) {
            count++
        }
    }
    return count
}
