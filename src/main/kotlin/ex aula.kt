fun main(){
    val res = mistrio(4)
    println(res)
}

fun adivinha(n: Int): Int {
    return if(n == 1)  3
    else adivinha(n-1)*3

}
fun enigma(n: Int): Int {
    return if (n<10)n
    else enigma(n/10)+(n%10)
}
fun misterioso(n: Int): Int {
    return if(n==0) 2 else misterioso(n-1)*2

}
fun mistrio(n: Int): Int {
    var res =2
    for(i in 1..n){
        res*=(2)
    }
    return res
}
fun test():Boolean{
    return true
}