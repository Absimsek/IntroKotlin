package com.example.myapp.oop.july28.collections.arraylists

fun main() {
    val list1= ArrayList<String>()
    list1.add("apple")
    list1.add("peach")
    list1.add("grape")
    list1.add("banana")
    list1.add("carrot")
    list1.add("tomato")
    println(list1.toString() + "\n")//toString is default added to printing list so no need actually

    for(fruit in list1){
        print("fruit : $fruit \t")// to print all method with additional messages
    }
println("\n")
    for ((index,fruit) in list1.withIndex()){
        print("fruit $index : $fruit \t")// to take list with indexes together
    }
}