package kotlin1

fun main(args: Array<String>) {

    var myTime = MyTime()
    myTime.doSomething()

}

class MyTime : Time {

    override fun doSomething(): () -> Unit {
        return super.doSomething()
    }
}

interface Time{

    fun doSomething() = {

        var a = 10
        var b = 20
        println(a + b)
    }
}

interface Time2{

    fun doSomething() = {

        println("Hi Time 2")

    }
}





