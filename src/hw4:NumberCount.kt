package src

import java.util.*

/** Aidai Atakulova
 */

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Enter a number: ")
    var num: Int = sc.nextInt()
    var count = 0

    while (num != 0) {
        num /= 10
        ++count
    }

    println("Number of digits: $count")
}
