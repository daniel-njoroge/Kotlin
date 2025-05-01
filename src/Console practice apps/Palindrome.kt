package `Console practice apps`

fun main() {
    print("Enter a word or phrase: ")
    val input = readLine()?.replace("\\s".toRegex(), "")?.lowercase() ?: return

    val isPalindrome = input == input.reversed()

    if (isPalindrome)
        println("It's a palindrome.")
    else
        println("Not a palindrome.")
}
