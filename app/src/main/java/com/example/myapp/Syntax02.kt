package com.example.myapp

import java.util.Scanner
import kotlin.random.Random

// when x..y used it means start from x and go until b

fun main() {
    val test=ArrayList<String>()
    test.add("a")
    test.add("b")
    test.add("c")

    for (i in 0 until test.size){ //starts from 0 goes until list size size not included
        // for this example size iz 3 so 0,1,2 indexes are used
    }
    for (i in 0..10 step 2){}// from 0 to 10 and goes 2 each loop 0 2 4 6 8 10

    for (i in 10 downTo 0 step 2){}// from 10 to 0 goes 2 each loop 10 8 6 4 2 0

    // taking inout for loop count
    var input=Scanner(System.`in`)
    println("give me loop number")
    var loopCount=input.nextInt()

    for(i in 1..loopCount){
        println("loop $i")
    }

    // creating an array as follows

    var arr01= arrayOf<Int>(1,2,3,4,5)// an integer array
    var arr02= arrayOf(1,2,"a","b")// an all in array
    var arr03= Array<Int>(5){0}// an int array of 5 element all are 0 as default

    println("arr01 = $arr01")// gives reference not printing the content
    println("arr01 ${arr01.contentToString()}") // gives content of array

    //except from add/delete methods most of the arraylists functions are included in array here
    println(arr01.contains(5))
    // random method as follows
    var randomNumber= Random.nextInt(0,10)// gives random number between 0 and 9
}