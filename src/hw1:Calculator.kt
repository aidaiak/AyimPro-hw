package src

import java.lang.NumberFormatException

//Aidai Atakulova
fun main() {
    println("Number input: ")
    val a1 = readLine().parseToInt()
    println("Operator: ")
    val o1 = readLine()?.firstOrNull()
    println("Number input: ")
    val a2 = readLine().parseToInt()

    val res = when(o1) {
        '+' -> a1 + a2
        '-' -> a1 - a2
        '*' -> a1 * a2
        '/' -> {
            if (a2 == 0) {
                println("You cannot divide by zero")
                return
            }
            a1 / a2
        }
        else -> {
            println("There is a mistake in your operation")
            return
        }
    }
    println("Result: $res")
}

//Отдельная функция, чтобы обернуть в exception деление на 0
/*private fun div(a1: Int, a2: Int): String {
    try {
        return "res = ${a1 / a2}"
    } catch (e: ArithmeticException) {
        println("You cannot divide by zero")
    }
}*/

private fun String?.parseToInt(): Int {
    if (this == null) return 0
    if (this == "") return 0

    return try {
        this.toInt()
    } catch (e: NumberFormatException) {
        println("exception = $e")
        return 0
    }
    return 0
}
