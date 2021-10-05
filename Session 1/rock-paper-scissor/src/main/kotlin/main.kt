import kotlin.random.Random

fun main(){

  play()

    }

fun play(){
    val options = arrayOf("rock", "paper", "scissors")
    //choosing random value from array
    val pc = options[Random.nextInt(0,2)]

    //asking input to user
    println("Choose rock, paper or scissors:")
    val input = readLine()

    //showing the values
    println("You chose $input and they chose $pc")

    //checking values
    when(input + pc){
        "paper" + "scissors" -> println("You lose !")
        "paper" + "rock" -> println("You win !")
        "paper" + "paper" -> {
            println("Try again")
            play()
        }
        "scissors" + "paper" -> println("You win !")
        "scissors" + "rock" -> println("You lose !")
        "scissors" + "scissor" -> {
            println("Try again")
            play()
        }
        "rock" + "scissors" -> println("You win !")
        "rock" + "rock" -> {
            println("Try again")
            play()
        }
        "rock" + "paper" -> println("You lose !")
        else -> {
            println("You did not choose any of the rock, paper, scissors options. Try again !")
            play()
        }

    }

    println("Want to try again?")

    var tryAgain = readLine()
    
    when(tryAgain){
        "yes" -> play()
        "no" -> {
            println("Thank you for playing with me :)")
        }
        else -> {
            println("Answer yes or no, please")
        }
    }
}