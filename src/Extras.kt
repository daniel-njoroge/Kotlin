//To create arrays in Kotlin, you can use:
//
//functions, such as arrayOf(), arrayOfNulls() or emptyArray().
//
//the Array constructor.

fun main(){
    // Creates an array with values [1, 2, 3]
    val simpleArray = arrayOf("front1","Front2","back1","back2")
    println(simpleArray.joinToString())

    // Creates an array with values [null, null, null]
    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())
}