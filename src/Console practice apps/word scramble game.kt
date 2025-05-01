import kotlin.random.Random

fun scramble(word: String): String {
    return word.toCharArray().apply { shuffle() }.concatToString()
}

fun main() {
    val words = listOf("kotlin", "developer", "android", "function", "variable")
    val chosenWord = words.random()
    val scrambledWord = scramble(chosenWord)
    val maxTries = 3
    var tries = 0

    println("🔤 Welcome to Word Scramble!")
    println("Unscramble this word: $scrambledWord")

    while (tries < maxTries) {
        print("Your guess: ")
        val guess = readLine()?.trim()?.lowercase()

        if (guess == chosenWord) {
            println("🎉 Correct! You guessed it.")
            return
        } else {
            tries++
            if (tries < maxTries) {
                println("❌ Wrong! Try again (${maxTries - tries} tries left)")
            }
        }
    }

    println("😢 Out of tries! The word was: $chosenWord")
}