package `Console practice apps`

fun factorial(n: Int): Long {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun main() {
    print("Enter a number: ")
    val num = readLine()?.toIntOrNull()

    if (num != null && num >= 0) {
        println("Factorial of $num is ${factorial(num)}")
    } else {
        println("Please enter a non-negative integer.")
    }
}
