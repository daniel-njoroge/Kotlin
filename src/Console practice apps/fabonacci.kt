package `Console practice apps`

fun main() {
    print("Enter the number of terms for the Fibonacci sequence: ")
    val n = readLine()?.toIntOrNull() ?: return

    var a = 0
    var b = 1

    println("Fibonacci Sequence:")
    for (i in 1..n) {
        print("$a ")
        val sum = a + b
        a = b
        b = sum
    }
    println()
}
