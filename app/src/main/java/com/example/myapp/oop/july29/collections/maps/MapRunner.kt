package com.example.myapp.oop.july29.collections.maps

fun main() {
    val map1=mutableMapOf<Int,String>(1 to "Ali", 2 to "Berkay")
    map1.put(5,"Mehmet")
    println(map1)

    val o1=Student(1,"Ali","8th")
    val o2=Student(2,"Berkay","9th")
    val o3=Student(3,"Mehmet","10th")
    val o4=Student(4,"Fatih","11th")
    val o5=Student(5,"Mustafa","12th")

    val students= HashMap<Int,Student>()
    students.put(o1.no,o1)
    students.put(o2.no,o2)
    students.put(o3.no,o3)
    students.put(o4.no,o4)
    students.put(o5.no,o5)

    for ((studentNo,obj)in students){
        println("\nStudent NO : $studentNo")
        println("Student NAME : ${obj.name}")
        println("Student GRADE : ${obj.grade}")
    }

}