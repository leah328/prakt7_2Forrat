fun main()
{
    try{
        println("введите длину стороны A отверстия")
        var a=readLine()!!.toDouble()
        println("введите длину стороны B отверстия")
        var b=readLine()!!.toDouble()
        println("введите длину стороны x кирпича")
        var x=readLine()!!.toDouble()
        println("введите длину стороны y кирпича")
        var y=readLine()!!.toDouble()
        println("введите длину стороны z кирпича")
        var z=readLine()!!.toDouble()
        if (a<=0||b<=0||x<=0||y<=0||z<=0) {println("неверные значения")}
        else{
            if (a>=x&&b>=y||a>=y&&b>=x||a>=x&&b>=z||a>=z&&b>=x||a>=z&&b>=y||a>=y&&b>=z) {println("пройдет")}
            else {println("не пройдет")}
        }
    }
    catch (e: Exception)
    {
        println("error")

    }
}
