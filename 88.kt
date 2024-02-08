
fun main()
{
    try{
        println("введите первое число")
        var a=readLine()!!.toDouble()
        println("введите второе число")
        var b=readLine()!!.toDouble()

        if (a<=b) {  var aa=0
            println ("первое число: ${aa}, второе число: ${b}")
        }
        else {println("первое число: ${a}, второе число: ${b}")}
    }
    catch (e: Exception)
    {
        println("error")

    }

}
