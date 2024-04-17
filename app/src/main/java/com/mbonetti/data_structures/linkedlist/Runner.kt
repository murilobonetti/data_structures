package com.mbonetti.data_structures.linkedlist

fun main() {
    val list =
        Node(value = 1, next = Node(value = 2, Node(value = 3, Node(value = 4, Node(value = 5)))))

//    println(list)
//    list.printInReverse()

//    pushExample()

//    appendExample()

//    insertExample()

//    popExample()

//    removeLastExample()

    removeAfterExample()
}

fun pushExample() {
    val list = LinkedList<Int>()

    list.push(value = 3).push(value = 8).push(value = 10).push(value = 16)

    println(list)
}

fun appendExample() {
    val list = LinkedList<Int>()

    list.append(value = 3).append(value = 8).append(value = 10).append(value = 16)

    println(list)
}

fun insertExample(){
    val list = LinkedList<Int>()

    list.push(value = 3).push(value = 2).push(value = 1)

    println("Before inserting: $list")

    var middleNode = list.nodeAt(1)!!

    for (i in 1..3) {
        middleNode = list.insert(0, middleNode)
    }

    println("After inserting $list")
}

fun popExample() {
    val list = LinkedList<Int>()

    list.push(value = 3).push(value = 2).push(value = 1)

    println("Before popping list: $list")

    val poppedValue = list.pop()

    println("After popping list: $list")

    println("Popped value: $poppedValue")
}

fun removeLastExample() {
    val list = LinkedList<Int>()

    list.push(value = 3).push(value = 2).push(value = 1)

    println("Before removing last node: $list")

    val removedValue = list.removeLast()

    println("After removing last node: $list")

    println("Removed value: $removedValue")
}

fun removeAfterExample() {
    val list = LinkedList<Int>()

    list.push(value = 3).push(value = 2).push(value = 1)

    println("Before removing at particular index: $list")

    val index = 1
    val node = list.nodeAt(index -1)!!
    val removedValue = list.removeAfter(node)

    println("After removing at index: $index: $list")

    println("Removed value: $removedValue")
}
