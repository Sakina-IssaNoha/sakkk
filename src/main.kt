fun main(){
    var result = addition(36,72,3)
    println(result)
    var d = multiplication(4,6,2)
    println(d)
subtraction(2021,2001)
years("I am", 21 , "years old")
}

fun addition(a:Int,b:Int,c:Int):Int{
    var sum= a + b + c
    return sum
}

fun multiplication(a:Int,b:Int,c:Int):Int{
    var product= a * b * c
    return product
}

fun subtraction (a:Int,b:Int){
    var substract= a - b
    println(substract)

}

fun years (a:String,b:Int,c:String){
    var age= a + b + c
    println(age)
}