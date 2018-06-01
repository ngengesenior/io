package _05_functional

fun main(args: Array<String>) {

    val emails = listOf(
            "seniorngenge@gmail.com",
            "molingejr@yahoo.net",
            "mjpaul@njaka.cm",
            "so" +
                    "meguy@yahoo.com",
            "anthonio@ymail.com")

    filterEmailAddresses(emails)


}

fun filterEmailAddresses( emails:List<String>):List<String>
{
    val comEmails = emails.filter {
        it -> it.endsWith("com")
    }
            .also { print(it) }
    return comEmails
}


//fun greaterThanZero(numbers:List<Int>):List<Int>
//{
//    val nums = numbers.filter {
//        it > 0
//    }
//
//    return nums
//}

//Lambdas
//val sum = {x:Int,y:Int-> x+y}

