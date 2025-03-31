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
}