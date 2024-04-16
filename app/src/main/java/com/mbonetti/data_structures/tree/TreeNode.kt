package com.mbonetti.data_structures.tree

import com.mbonetti.data_structures.queue.QueueImpl

typealias Visitor<T> = (TreeNode<T>) -> Unit

class TreeNode<T>(val value: T) {

    private val children: MutableList<TreeNode<T>> = mutableListOf()

    fun add(child: TreeNode<T>) = children.add(child)

    fun forEachDepthFirst(visit: Visitor<T>) {
        visit(this)

        children.forEach {
            it.forEachDepthFirst(visit)
        }
    }

    fun forEachLevelOrder(visit: Visitor<T>) {
        visit(this)

        val queue = QueueImpl<TreeNode<T>>()

        children.forEach {
            queue.enqueue(it)
        }

        var node = queue.dequeue()

        while (node != null) {
            visit(node)

            node.children.forEach { queue.enqueue(it) }

            node = queue.dequeue()
        }
    }

    fun search(value: T): TreeNode<T>? {
        var result: TreeNode<T>? = null

        forEachDepthFirst {node ->
            if (node.value == value) {
                result = node
                println("Found value ${node.value}")
            }
        }

        if (result == null) {
            println("No value found")
        }

        return result
    }

    fun printEachLevel() {
        val queue = QueueImpl<TreeNode<T>>()

        var nodesLeftInCurrentLevel = 0

        queue.enqueue(this)
        while (queue.isEmpty.not()) {
            nodesLeftInCurrentLevel = queue.count

            while (nodesLeftInCurrentLevel > 0) {
                val node = queue.dequeue() ?: break

                println("${node.value}")

                node.children.forEach { child ->
                    queue.enqueue(child)
                }

                nodesLeftInCurrentLevel--
            }
        }
    }
}
