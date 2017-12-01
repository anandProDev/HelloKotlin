import domain.Person

fun main(args : Array<String>){
    println("Hello world")

    var question = Question("what is your name", "anand")


    var message = if(question.answer == "anand") "You are correct" else "Please try again"

    println(message)


}

class Question(question: String, answer : String) {

    var answer = "42"
    var question = "What is your name?"

}