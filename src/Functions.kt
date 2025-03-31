fun iseven(thenum: Int):String {
    var answer = if (thenum%2 == 0){
        "The number is even"
    }else{
        "The number is odd"
    }
    return answer
}

//Simplified
fun iseven2(thenum: Int):String {
    return if (thenum%2 == 0){
        "The number is even"
    }else{
        "The number is odd"
    }
}

//simplified further
fun iseven3(thenum: Int):String = if (thenum%2 == 0){
    "The number is even"
}else{
    "The number is odd"
}




fun reducebyone(num: Int):Int{
    return num - 1
}


fun main(){

    println(iseven(31))
    println(iseven2(31))
    println(iseven3(31))
    println(reducebyone(5))


    //Anonymous functions
    val stringLengthFunc: (String) -> Int = { input ->
        input.length
    }
    val stringLength: Int = stringLengthFunc("Android")

    println(stringLength)

    //Higher-order functions - A function can take another function as an argument.
    fun stringMapper(str: String, mapper: (String) -> Int): Int {
        // Invoke function
        return mapper(str)
    }
    println(stringMapper("Android", { input ->
        input.length
    }))
}


