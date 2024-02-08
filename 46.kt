fun main()
{
    try{
        println("введите номер дня недели от 1 до 7")
        var a=readLine()!!.toInt()
        if (a<=7&&a>=1) {
            when (a) {
                 1->println("рабочий день")
                 2->println("рабочий день")
                 3->println("рабочий день")
                4->println("рабочий день")
                5->println("рабочий день")
                6->println("выходной")
                7->println("выходной")
            }
        }
        else {println("такого дня нет")}
    }
    catch (e: Exception)
    {
        println("error")
    }
}