package `Console practice apps`

fun main() {
    println("Enter a sentence:")
    val input = readLine()?.lowercase() ?: return

    val wordFreq = mutableMapOf<String, Int>()
    val words = input.split(" ", ".", ",", "!", "?", ":", ";").filter { it.isNotBlank() }

    for (word in words) {
        wordFreq[word] = wordFreq.getOrDefault(word, 0) + 1
    }

    println("\nWord Frequencies:")
    wordFreq.forEach { (word, count) ->
        println("$word: $count")
    }
}
