fun main() {
    println("Number in words:")
    val input = readLine()?.lowercase() ?: return
    val result = wordsToNumber(input)
    println("Output: $result")
}

fun wordsToNumber(words: String): Long {
    val units = mapOf(
        "zero" to 0, "one" to 1, "two" to 2, "three" to 3, "four" to 4,
        "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9,
        "ten" to 10, "eleven" to 11, "twelve" to 12, "thirteen" to 13,
        "fourteen" to 14, "fifteen" to 15, "sixteen" to 16, "seventeen" to 17,
        "eighteen" to 18, "nineteen" to 19
    )

    val tens = mapOf(
        "twenty" to 20, "thirty" to 30, "forty" to 40, "fifty" to 50,
        "sixty" to 60, "seventy" to 70, "eighty" to 80, "ninety" to 90
    )

    val scales = mapOf(
        "hundred" to 100,
        "thousand" to 1_000,
        "million" to 1_000_000,
        "billion" to 1_000_000_000
    )

    var current = 0L
    var total = 0L

    val tokens = words.replace("-", " ").split(" ")

    for (word in tokens) {
        when {
            word in units -> current += units[word]!!
            word in tens -> current += tens[word]!!
            word == "hundred" -> current *= 100
            word in scales -> {
                current *= scales[word]!!
                total += current
                current = 0
            }
        }
    }

    return total + current
}
