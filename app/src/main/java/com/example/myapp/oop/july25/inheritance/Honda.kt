package com.example.myapp.oop.july25.inheritance

class Honda(
    var model:String="Accord",
    type:String="Sedan",
    color:String="Blue",
    gear:String="Auto"
) : Car(type,color,gear) {
}