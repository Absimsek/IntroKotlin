package com.example.myapp.oop.july29.collections.sets

import com.example.myapp.oop.july29.collections.maps.Student

fun main() {
    val set01= setOf("a","b","c","a")
    println(set01)// no duplication "second 'a' is not taken"
    //set01.add//no such function due to it is read only

    val o1= Student(1,"Ali","8th")
    val o2= Student(2,"Berkay","9th")
    val o3= Student(3,"Mehmet","10th")
    val o4= Student(4,"Fatih","11th")
    val o5= Student(5,"Mustafa","12th")

    val students=HashSet<Student>()
    students.add(o1)
    students.add(o3)
    students.add(o2)
    students.add(o5)
    students.add(o4)

    for (o in students){
        println("\nstudent NO : ${o.no}")
        println("student NAME : ${o.name}")
        println("student GRADE : ${o.grade}")
    }
}