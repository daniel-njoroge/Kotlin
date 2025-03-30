fun iseven(thenum: Int):String {
    val answer = if (thenum%2 == 0){
        "The number is even"
    }else{
        "The number is odd"
    }
    return answer
}


fun reducebyone(num: Int):Int{
    val mynum = num - 1
    return mynum
}
fun main(){

    println(iseven(31))
    println(reducebyone(5))
}