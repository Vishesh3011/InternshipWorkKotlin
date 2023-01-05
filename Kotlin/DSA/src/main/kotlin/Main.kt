fun tailOfList(list: List<Int>){
    println(list[list.lastIndex])
}

fun lastTwoElements(list: List<Int>){
    for((index, x) in list.withIndex()){
        if(index >= list.size - 2)
            println(x)
    }
}

fun findNthElement(n: Int, list: List<Int>){
    for((index, x) in list.withIndex()){
        if(index == n + 1)
            println(x)
    }
}

fun findLengthOfTheList(list: List<Int>){
    println(list.size)
}

fun reverseAList(list: List<Int>): List<Int>{
//    val reversedList = mutableListOf<Int>()
//    for(x in list.size - 1 downTo 0){
//        reversedList.add(list[x])
//    }
//    return reversedList

    return list.reversed()
}

fun checkPalindrome(list: List<Int>){
    if(list == list.reversed())
        println("It is a Palindrome")
    else
        println("Not a Palindrome")
}

fun removeDuplicates(list: List<Int>): List<Int>{
//    val set = mutableSetOf<Int>()
//    for(x in list)
//        set.add(x)
//    return set.toList()

//    return list.distinct()

    return list.toSet().toList()
}

fun duplicateTheElementsOfTheList(list: List<Int>): List<Int>{
    val newList = mutableListOf<Int>()
    for(x in list){
        newList.add(x)
        newList.add(x)
    }
    return newList
}

fun splitList(list: List<Int>, n: Int){
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()
    for((index, x) in list.withIndex()){
        if(index < n - 1)
            list1.add(x)
        else
            list2.add(x)
    }
    println(list1)
    println(list2)
}

fun sliceList(start: Int, stop: Int, list: List<Int>):List<Int> {
    val oPList = mutableListOf<Int>()
    var i = start - 1;
    while(i <= stop - 1){
        oPList.add(list[i])
        i++
    }
    return oPList
}

fun rotateListToLeft(n: Int, list: List<Int>): List<Int>{
//    val newList = mutableListOf<Int>()
    val newList = list.drop(n) + list.take(n)
    return newList
}

fun rotateListToRight(n: Int, list: List<Int>): List<Int>{
//    val newList = mutableListOf<Int>()
    val newList = list.takeLast(n) + list.dropLast(n)
    return newList
}

fun removeKthEle(list: List<Int>, n: Int): List<Int>{
    return list.take(n) + list.drop(n + 1)
}

fun insertElement(list: MutableList<Int>, ele: Int, n: Int){
    list.add(n, ele)
}

fun createListWithARange(start: Int, stop: Int): List<Int>{
    val list = mutableListOf<Int>()
    for(x in start..stop){
        list.add(x)
    }
    return list
}

fun main() {
//    val num = readLine()!!.toInt()
//
////    println(num)
//
//    val arr = Array<Int>(num){readLine()!!.toInt()}
//    for(x in arr)
//        print("$x ")
//
//    val list = arr.toList()

    val list = listOf<Int>(1, 0, 9, 10, 13, 5, 7)

    tailOfList(list)

    lastTwoElements(list)

//    val n = readLine()!!.toInt()
//    findNthElement(n, list)

    findLengthOfTheList(list)

    println(reverseAList(list))

    val list2 = listOf<Int>(100, 4, 1, 0, 1, 1, 0, 1, 4, 100)
    checkPalindrome(list2)

    println(removeDuplicates(list2))

    println(duplicateTheElementsOfTheList(list))

//    val brk = readLine()!!.toInt()
//    splitList(list, brk)

//    val start = readLine()!!.toInt()
//    val stop = readLine()!!.toInt()
//    println(sliceList(start, stop, list))

//    val n = readLine()!!.toInt()
//    println(rotateListToLeft(n, list))
//    println(rotateListToRight(n, list))

//    val n = readLine()!!.toInt()
//    println(removeKthEle(list, n))

//    val n = readLine()!!.toInt()
//    val ele = readLine()!!.toInt()
//    val lst = mutableListOf<Int>(1, 0, 9, 10, 13, 5, 7)
//    insertElement(lst, ele, n)
//    println(lst)

    val start = readLine()!!.toInt()
    val stop = readLine()!!.toInt()
    println(createListWithARange(start, stop))
}