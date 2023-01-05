fun main(args: Array<String>) {
//    Lists
////    Immutable
    val list = listOf<Int>(1, 3, 5, 7, 9, 10, -1, -7, 100)
    println(list)
////    Traversing
    for(i in list)
        print("$i ")

    for((index, element) in list.withIndex())
        print("\n$element at $index position")

    println("\n")

    println(list.sorted())

////    Mutable
    var mList = mutableListOf<Int>(1, 8, 6, 9, 10, 15)
    mList.add(2)
    println(mList)

    mList.removeAt(2)
    println(mList)
    println(mList.sort())

////    Set
    var set = setOf<Int>(2, 1, 42, 5, 1, 3)
    println(set)

////    Maps
    val map = mapOf<String, Int>("vishesh" to 1, "sparsh" to 2, "dev" to 0)
    println(map)
    println(map.keys)
    println(map.values)
    println(map.get("vishesh"))
    println(map.filter { (key, value) -> key.endsWith("h") })

////    Mutable Maps
    val mMap = mutableMapOf<String, Int>("vishesh" to 1, "sparsh" to 2, "dev" to 0)
    println(mMap)
    println(mMap.keys)
    println(mMap.values)
    mMap["okay"] = 3
    mMap.put("gG", 5)
    println(mMap)
    println(mMap.toSortedMap())
}