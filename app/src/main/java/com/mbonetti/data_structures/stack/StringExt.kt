package com.mbonetti.data_structures.stack

fun String.isValidParentheses(): Boolean {
    val stack = StackImpl<Char>()

    for (char in this) {
        when (char) {
            '(' -> {
                stack.push(char)
            }

            ')' -> {
                if (stack.isEmpty) {
                    return false
                } else {
                    stack.pop()
                }
            }
        }
    }
    return stack.isEmpty
}
