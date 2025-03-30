fun main(){
    var mynum = 0

    if(mynum%2 == 0){
        println("The number $mynum is even")
    }
    else{
        println("The number $mynum is odd")
    }

    var mynum2 = 0

    if(mynum2 < 0){
        println("The number $mynum2 is less than 0")
    }
    else if(mynum2 > 0){
        println("The number $mynum2 is greater than 0")
    }

    else{
        println("The number $mynum2 is equal to 0")
    }



    val isold = if(mynum >= 18 && mynum2 < 130){
        "Old enough"
    }
    else if(mynum2 > 0 && mynum2 < 18){
        "Too young"
    }
    else{
        "Invalid"
    }
    println(isold)

    //alternative method
    var isold2 = when{
        mynum in 18..130 -> "Old enough"
        mynum in 1..17 -> "Too young"
        else -> "Invalid Age"
    }
    println(isold2)
}