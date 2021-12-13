package src

import java.lang.NumberFormatException
import java.util.*

fun main() {
    val map = hashMapOf(
        "Masha" to 556123123, "Sasha" to 500890678, "Dasha" to 551367890, "Kasha" to 770689456)

    println("Enter number of records: ")
    val rec = readLine().parseToInt()
    val oper = (1..rec).iterator()

    oper.forEach {
        val sc = Scanner(System.`in`) // Scanner обязательно закрываем
        println("Enter name and phone number: ")
        val name = sc.next()
        val phone = sc.nextInt()
        map[name] = phone
    }
    do {
        println("Enter name: ")
        val key = readLine()
        if (key in map.keys) {
            println("$key - ${map[key]}")
        } else {
            println("Not found")
        }
    } while (key != "exit")
}

private fun String?.parseToInt(): Int {
    if (this == null) return 0
    if (this == "") return 0

    return try {
        this.toInt()
    } catch (e: NumberFormatException) {
        println("exception = $e")
        return 0
    }
}
