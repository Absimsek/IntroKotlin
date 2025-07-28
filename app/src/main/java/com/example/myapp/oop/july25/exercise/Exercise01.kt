package com.example.myapp.oop.july25.exercise

// find the angle sum of given margin count
fun degreeSum(count : Int):Int{
    var result=180
    for(i in 4..count){
        result+=180
    }
return result
}

// calculate the wage by the given number of days and return it
// max 8 hours per day
//hourly 10$
//overwork hourly 20$
// 160+ hour is overwork
fun wageCalc(days : Int):Int{
    var result=0
var workingHour=0;
    for (i in 1..days){
        workingHour += 8
        if (workingHour<=160){
            result+=8*10
        }else{
            result+=8*20
        }
    }
    return result
}

// calculate the payment with given internet quota
//50 gb 100 $
//1 gb 4$ after 50gb

fun quotaCalc(quota : Int):Int{
    var result=0
    for (i in 1..quota){
        result+=2
        if (i>50){
            result+=2
        }
    }
    return result
}