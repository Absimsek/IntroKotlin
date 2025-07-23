package com.example.myapp

import java.util.Scanner

fun main(){// access modifier and data type is not needed
    println("Hello World")
    println("What's Up")
    println("yoooo")

    var x=1;
    var y="ali";
    var z='c';
    var w=1.5;
    // variable type doesn't needed
    //if no matter what, you want data type than use following
    var a:Double= 5.0;// assigned to be double throws exception if int number used.
    // all data types starts with UpperCase letter unless java primitives

    println("$y is a string")// use $ before using any specific data when trying to print together
    // no need any other operator to concatenate string with given data.

    println("$a + $w can be written as ${a+w}")//when arithmetic operations needed use {}
    // and do the operation inside {}.

    //primitive types need to be initialized by declaration or error occurs
    //var t;

    // to make a data unmutable use val. does the same job as final keyword in java
    val l=10;
    // use \/ inside string to use / character
    //use \" inside the string to use " character

    println("this is \\inside back slash\\ and this  \"inside double-quote\" "  )
    //to convert data types use toDataName
    var k=l.toDouble() // converts integer l to double
    println(k)

    // to take input from console use Scanner(System.in) and assign it to a val
    var input1=0;
    val input=Scanner(System.`in`)
    println("enter something")
    input1=input.nextInt()
    println("you have entered  $input1")

    //switch is known as when here
    // no need case keyword just write the case itself  and -> sign
    // no default keyword instead use else->{} at the end
    println("enter number")
    x=input.nextInt()
    when(x){
        1-> println("number 1 entered")
        10-> println("number 10 entered")
        20-> println("number 20 entered")
        30-> println("number 30 entered")
        40-> println("number 40 entered")
        50-> println("number 50 entered")
        else ->{
            println("number is not in case list")
        }
    }
}