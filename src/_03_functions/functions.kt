package _03_functions



//fun tripple(x:Int):Int
//{
//    return 3 * x
//}


//fun double(x:Int) = 2 * x


fun main(args: Array<String>) {
    //val res = tripple(4)
}




//fun getName(name:String = "John Doe",height:Float= 1.5f )
//{
//    println("Name is $name and height is $height")
//
//}


/**
 * Extension functions
 */

//fun MutableList<Int>.swap(index1: Int, index2: Int) {
//    val tmp = this[index1] // 'this' corresponds to the list
//    this[index1] = this[index2]
//    this[index2] = tmp
//}


fun String.isCamerNumber(number:String):Boolean{

    return number.startsWith("+237")
}
