fun main()
{
    try{
        println("введите значение a")
        var a=readLine()!!.toDouble()
        println("введите значение b")
        var b=readLine()!!.toDouble()
        println("введите значение c")
        var c=readLine()!!.toDouble()
        println("введите значение d")
        var d=readLine()!!.toDouble()
        println("введите значение e")
        var e=readLine()!!.toDouble()
        println("введите значение f")
        var f=readLine()!!.toDouble()

        var x=(f*b-e*c)/(d-(a*e))
        var y=(f-(d*x))/e
         println("x=${x},y=${y}")
    }
    catch (e: Exception)
    {
        println("error")
    }
}