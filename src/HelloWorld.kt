import domain.Person
import java.io.FileReader
import java.util.*

fun main(args : Array<String>){
    println("Hello world")

    // method call
    var question = Question("what is your name","anand", "answer")

    var q:Question?=null

    question.displayAnswer()


    // try catch
    val value:Int? = try {
        Integer.parseInt("a");
    }catch (n:NumberFormatException){
        null
    }
    println(value)


    // for loop
    for(i in 10 downTo 1 step 2)
        println(i)

    var list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for(i in list)
        println(i)

    var ages:TreeMap<String, Int> = TreeMap()
    ages["anand"] = 30
    ages["Kar"] = 30
    ages["Test"] = 2

    for((name, age) in ages)
        println("$name is $age")


    // file reader

    var content = FileReader("myFile.txt")

    try {
        println(content.read())
    }catch (e:Exception){
        e.message
    }

    println(question.getMyName("anand"))


}

class Question(question: String, correctAnswer: String, answer : String) {
    var number = 1;
    var answer = answer
    var question = question
    var correctAnswer = correctAnswer

    fun displayAnswer(){

        var message = if(answer == correctAnswer) "You are correct" else "Please try again"

        println(message)
    }

    fun getMyName(name : String) : String {
        return name
    }

}