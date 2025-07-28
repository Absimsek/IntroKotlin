package com.example.myapp.oop.july28.collections.arraylists

fun main() {
    val o1=Info("Ali",21);  val o2=Info("Berkay",22); val o3=Info("Yusuf",23)
    val list1=ArrayList<Info>()
    list1.add(o1);  list1.add(o2);  list1.add(o3)

   val nameSortList1= list1.sortedWith(compareBy{it.name})//sorts by name A-Z
   val nameSortList2= list1.sortedWith(compareByDescending{it.name})//sorts by name Z-A
   val ageSortList1= list1.sortedWith(compareBy{it.age})//sorts by age small to big
   val ageSortList2= list1.sortedWith(compareByDescending{it.age})//sorts by age big to small

    println("name sort: ")
    for (s in nameSortList1){print("${s.name} - ${s.age} \t"); }

    println("\nname reversed sort:")
    for (s in nameSortList2){print("${s.name} - ${s.age} \t"); }

    println("\nage sort :")
    for (s in ageSortList1){print("${s.age} - ${s.name} \t"); }

    println("\nage reversed sort : ")
    for (s in ageSortList2){print("${s.age} - ${s.name} \t"); }

}