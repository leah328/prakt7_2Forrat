fun main()
{
    try{
        println("введите координату a")
        var a=readLine()!!.toDouble()
        println("введите координату b")
        var b=readLine()!!.toDouble()
        println("введите координату c")
        var c=readLine()!!.toDouble()
        println("введите координату d")
        var d=readLine()!!.toDouble()
        println("введите координату x")
        var x=readLine()!!.toDouble()
        if (a<d&&c<d){
            when
            {
                (x>=a&&x<=b)->println("x принадлежит отрезку [a,b]")
                (x>=c&&x<=d)->println("x принадлежит отрезку [c,d]")
                (x>=a&&x<=b&&x>=c&&x<=d)->println("x принадлежит отрезку [a,b] и отрезку [c,d]")
            }
        }
       else { println("упс, что-то пошло не так")}
    }
    catch (e: Exception)
    {
        println("error")
    }
}
