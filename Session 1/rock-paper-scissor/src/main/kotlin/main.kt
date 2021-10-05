import kotlin.random.Random
var yourPoints = 0
var pcPoints = 0

fun main() {

    play()
}
fun winOrLose(value: Boolean) {
    if (value) {
        println("You win !")
        yourPoints++
    } else {
        println("You lose !")
        pcPoints++
    }
}

fun play() {
    val options = arrayOf("rock", "paper", "scissors", "lizard", "spock")
    //choosing random value from array
    val pc = options[Random.nextInt(0, 2)]

    //asking input to user
    println("Choose rock, paper, scissors, lizard or spock:")
    val input = readLine()

    //showing the values
    println("You chose $input and they chose $pc")

    //checking values
    when (input + pc) {
        //paper
        "paper" + "scissors" -> {
            println("You lose !")
            winOrLose(false)
        }
        "paper" + "rock" -> {
            println("You win !")
            winOrLose(true)

        }
        "paper" + "paper" -> {
            println("Try again")
            play()
        }
        "paper" + "spock" -> {
            println("You win !")
            winOrLose(true)

        }
        "paper" + "lizard" -> {
            println("You lose !")
            winOrLose(false)

        }

        //scissors
        "scissors" + "paper" -> {
            println("You win !")
            winOrLose(true)

        }
        "scissors" + "rock" -> {
            println("You lose !")
            winOrLose(false)

        }
        "scissors" + "scissors" -> {
            println("Try again")
            play()
        }
        "scissors" + "spock" -> {
            println("You lose !")
            winOrLose(false)

        }
        "scissors" + "lizard" -> {
            println("You win !")
            winOrLose(true)

        }


        //rock
        "rock" + "scissors" -> {
            println("You win !")
            winOrLose(true)

        }
        "rock" + "rock" -> {
            println("Try again")
            play()
        }
        "rock" + "paper" -> {
            println("You lose !")
            winOrLose(false)

        }
        "rock" + "spock" -> {
            println("You lose !")
            winOrLose(false)

        }
        "rock" + "lizard" -> {
            println("You win !")
            winOrLose(true)

        }

        //spock
        "spock" + "scissors" -> {
            println("You win !")
            winOrLose(true)

        }
        "spock" + "rock" -> {
            println("You win !")
            winOrLose(true)

        }
        "spock" + "paper" -> {
            println("You lose !")
            winOrLose(false)

        }
        "spock" + "spock" -> {
            println("Try again")
            play()
        }
        "spock" + "lizard" -> {
            println("You lose !")
            winOrLose(false)

        }

        //lizard
        "lizard" + "scissors" -> {
            println("You lose !")
            winOrLose(false)

        }
        "lizard" + "rock" -> {
            println("You lose !")
            winOrLose(false)

        }
        "lizard" + "paper" -> {
            println("You win !")
            winOrLose(true)

        }
        "lizard" + "spock" -> {
            println("You win !")
            winOrLose(true)

        }
        "lizard" + "lizard" -> {
            println("Try again")
            play()
        }


        else -> {
            println("You did not choose any of the rock, paper, scissors, lizard, spock options. Try again !")
            play()
        }

    }

    println("Want to try again?")

    var tryAgain = readLine()

    when (tryAgain) {
        "yes" -> {
            play()
        }

        "no" -> {
            println("Thank you for playing with me :)")
        }
        else -> {
            println("Answer yes or no, please")
        }
    }
}
