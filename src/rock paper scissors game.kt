import kotlin.random.Random

fun main() {
    val options = listOf("rock", "paper", "scissors")
    var playerChoice: String?

    println("🎮 Welcome to Rock, Paper, Scissors!")

    while (true) {
        print("Enter your choice (rock/paper/scissors): ")
        playerChoice = readLine()?.trim()?.lowercase()

        if (playerChoice in options) break
        println("❌ Invalid choice! Please choose rock, paper, or scissors.")
    }

    val computerChoice = options[Random.nextInt(options.size)]
    println("🖥️ Computer chose: $computerChoice")

    if (playerChoice == computerChoice) {
        println("🤝 It's a draw!")
    } else if (
        (playerChoice == "rock" && computerChoice == "scissors") ||
        (playerChoice == "paper" && computerChoice == "rock") ||
        (playerChoice == "scissors" && computerChoice == "paper")
    ) {
        println("🎉 You win!")
    } else {
        println("💔 You lose.")
    }
}
