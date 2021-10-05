import kotlin.random.Random

var yourPoints = 0
var pcPoints = 0
val options = arrayOf("rock", "paper", "scissors", "lizard", "spock")
var input: String? = null


fun main() {
    getInput()
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

fun getInput() {
    //asking input to user
    println("Choose rock, paper, scissors, lizard or spock:")
    input = readLine()
    for(option in options){
        if(input == option){
            play()
        }else{
            println("You did not choose any of the rock, paper, scissors, lizard, spock options. Try again !")
        }
    }

}

fun playAgain(){
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

fun play() {
    //choosing random value from array
    val pc = options.random()


    if (pc == input) {
        println("Try again")
        play()
    }
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

        else -> {
            println("You did not choose any of the rock, paper, scissors, lizard, spock options. Try again !")
            play()
        }

    }

    playAgain()
}
