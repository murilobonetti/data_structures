package com.mbonetti.data_structures.tree

fun makeBeverageTree(): TreeNode<String> {
    val tree = TreeNode("Beverages")

    val hot = TreeNode("hot")
    val cold = TreeNode("cold")

    val tea = TreeNode("tea")
    val coffee = TreeNode("coffee")
    val chocolate = TreeNode("hot chocolate")

    val blackTea = TreeNode("black tea")
    val greenTea = TreeNode("green tea")
    val chaiTea = TreeNode("chai tea")

    val soda = TreeNode("soda")
    val milk = TreeNode("milk")

    val gingerAle = TreeNode("ginger ale")
    val bitterLemon = TreeNode("bitter lemon")


    tree.add(hot)
    tree.add(cold)

    hot.add(tea)
    hot.add(coffee)
    hot.add(chocolate)

    cold.add(soda)
    cold.add(milk)

    tea.add(blackTea)
    tea.add(greenTea)
    tea.add(chaiTea)

    soda.add(gingerAle)
    soda.add(bitterLemon)

    return tree
}

fun main() {
    val tree = makeBeverageTree()

    tree.printEachLevel()

//    tree.forEachDepthFirst { println(it.value) }

//    tree.search("coffee")

}
