import kotlin.random.Random
fun main() {
    val options = listOf("rock", "paper", "scissors")

    println("🎮 Welcome to Rock, Paper, Scissors!")
    print("How many rounds do you want to play? ")

    val rounds = readLine()?.toIntOrNull()

    if (rounds == null || rounds <= 0) {
        println("❌ Invalid number of rounds.")
        return
    }

    var playerScore = 0
    var computerScore = 0

    for (round in 1..rounds) {
        println("\n🔁 Round $round of $rounds")
        var playerChoice: String?

        while (true) {
            print("Enter your choice (rock/paper/scissors): ")
            playerChoice = readLine()?.trim()?.lowercase()
            if (playerChoice in options) break
            println("❌ Invalid choice! Please choose rock, paper, or scissors.")
        }

        val computerChoice = options.random()
        println("🖥️ Computer chose: $computerChoice")

        if (playerChoice == computerChoice) {
            println("🤝 It's a draw!")
        } else if (
            (playerChoice == "rock" && computerChoice == "scissors") ||
            (playerChoice == "paper" && computerChoice == "rock") ||
            (playerChoice == "scissors" && computerChoice == "paper")
        ) {
            println("✅ You win this round!")
            playerScore++
        } else {
            println("❌ Computer wins this round!")
            computerScore++
        }
    }

    println("\n🏁 Game Over!")
    println("🧑 You: $playerScore | 🖥️ Computer: $computerScore")

    when {
        playerScore > computerScore -> println("🎉 You won the game!")
        playerScore < computerScore -> println("💔 You lost the game!")
        else -> println("🤝 It's a tie overall!")
    }
}
