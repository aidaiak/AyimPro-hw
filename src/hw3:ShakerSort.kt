package src

fun shakerSort(a: IntArray) {
    fun swap(i: Int, j: Int) {
        val temp = a[i]
        a[i] = a[j]
        a[j] = temp
    }
    do {
        var swapped = false
        for (i in 0 until a.size - 1)
            if (a[i] > a[i + 1]) {
                swap(i, i + 1)
                swapped = true
            }
        if (!swapped) break
        swapped = false
        for (i in a.size - 2 downTo 0)
            if (a[i] > a[i + 1]) {
                swap(i, i + 1)
                swapped = true
            }
    } while (swapped)
}

fun main(args: Array<String>) {
    val arr = intArrayOf(-8, 0, 89, 465, 1, 3, 67)

    shakerSort(arr)
    println(arr.contentToString())
}