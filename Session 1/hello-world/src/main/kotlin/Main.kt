fun main(){
    println("Hello World")
    greet()
}

fun greet(){
    val classmates = arrayOf("Liese", "Arno", "Britt")

    for(classmate in classmates){
        println("Hello " + classmate + ", welcome to Dev III !")
    }
}