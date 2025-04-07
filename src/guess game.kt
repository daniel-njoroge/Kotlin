import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var attempts = 0
    val maxAttempts = 5

    println("Welcome to the Guessing Game!")
    println("Guess a number between 1 and 100")

    while (attempts < maxAttempts) {
        print("Enter your guess: ")
        val input = readLine()
        val guess = input?.toIntOrNull()

        if (guess == null || guess !in 1..100) {
            println("Invalid input. Please enter a number between 1 and 100.")
            continue
        }

        attempts++

        if (guess == randomNumber) {
            println("🎉 Congratulations! You guessed the right number: $randomNumber")
            return
        } else {
            if (attempts == 1) {
                var tryAgain: String?
                while (true) {
                    print("Wrong guess. Do you want to try again? (yes/no): ")
                    tryAgain = readLine()?.trim()?.lowercase()
                    if (tryAgain == "yes" || tryAgain == "no") break
                    println("Please type 'yes' or 'no'.")
                }

                if (tryAgain == "no") {
                    println("Thanks for playing! The correct number was $randomNumber.")
                    return
                }
            } else if (attempts < maxAttempts) {
                println("Wrong guess. You have ${maxAttempts - attempts} attempt(s) left.")
            }
        }
    }

    println("Sorry! You've used all your attempts. The correct number was $randomNumber.")
}
