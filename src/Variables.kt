fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    //var to declare whose values can change
    var count: Int = 10
    var age: Int = 21

    //{Type inference - just assign value to variable compiler will infer type based on assigned value}
    var myint = 10
    var myage  = 21

    //count can change because i declared it with var
    count = 15
    println("New count value -> $count")

    //val to declare values that can't change
    val myname = "Daniel njoroge"

    //null values - in kotlin variables can't hold null values by default
    //specify a variable as being nullable by suffixing its type with ?
    val myname2 : String? = null
    //wrong val myname = String = null -> kotlin variables can't hold null values by default
    println("Myname2 =  $myname2")


}