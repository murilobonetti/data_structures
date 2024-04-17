package com.mbonetti.data_structures.linkedlist

data class Node<T: Any>(
    var value: T,
    var next: Node<T>? = null
) {

    override fun toString(): String {
        return if(next == null) {
            "$value"
        } else {
            "$value -> ${next.toString()}"
        }
    }

    fun printInReverse() {
        next?.printInReverse()

        if (next != null) {
            print(" -> ")
        }

        print(value.toString())
    }
}
