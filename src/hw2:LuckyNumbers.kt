package src

fun main() {
    val num = readLine()!!.toInt()
    val x4 = num % 10
    val x3 = num / 10 % 10
    val x2 = num / 100 % 10
    val x1 = num / 1000 % 10
    //println("num = $num, x4 = $x4, x3 = $x3, x2 = $x2, x1 = $x1")

    val res = x1 + x2 == x3 + x4

    println(res)
}