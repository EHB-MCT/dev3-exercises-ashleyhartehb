var tryCount = 1
var challenge = 1
fun main() {
    println("You are in a post apocalyptic world where machines roam the lands and some of them are corrupted by a certain cult. You're an outcast of your tribe because you've been born without parents and someone of the tribe chose to raise you instead. You're a very curious person who likes to learn more about the machines and their history.")
    println("You see an ancient door with 4 round slots.")
    challengeOne()
}

fun challengeOne() {
    challenge = 1
    val numbers = listOf("VI", "II", "V", "I")

    println("Choose 4 roman numbers for each slot and press enter after each number")

    val slot1 = readLine()
    val slot2 = readLine()
    val slot3 = readLine()
    val slot4 = readLine()
    val userNumbers = listOf(slot1, slot2, slot3, slot4)

    if (numbers == userNumbers) {
        challengeTwo()
    } else {
        gameOver()
    }
}

fun challengeTwo() {
    challenge = 2
    //println("Congratulations you found the answer on try n° ${tryCount}!")
    println("Guess what number the dice will fall on")
    val guess = Integer.valueOf(readLine())
    rollDice(guess)
}

fun rollDice(guess: Int) {
    var listOfValues = listOf(1, 2, 3, 4, 5, 6)
    var randomvalue = listOfValues.random()

    println("The dice fell on number ${randomvalue}")

    if (listOfValues.contains(guess)) {
        if (guess == randomvalue) {
            success()
        } else {
            gameOver()
        }
    } else {
        println("Please choose a number between 1 and 6")
    }

}

fun success() {
    println("Congratulations you won the game!")
}

fun gameOver() {
    println("Wrong answer")

    val hint1 = "Your device shows the following numbers: I V II VI "
    val hint2 = "It looks like the pannel has been turned downwards"

    if (challenge == 1) {
        tryCount++
        when (tryCount) {
            2 -> println(hint1)
            3 -> println(hint2)
            else -> {
                println("This is the last hint")
                println(hint1)
                println(hint2)
            }
        }
        challengeOne()

    } else if (challenge == 2) {
        challengeTwo()
    } else {
        println("No challenges anymore")
    }

}