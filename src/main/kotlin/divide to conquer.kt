fun main(){

}

fun binnarySearchIterative(a:IntArray, left: Int, right: Int, x: Int): Int{
    var l = left
    var r = right
    while(l <= r){
        val m =(l+r)/2
        if((x==a[m]))return m
        else if(x<a[m])r=m-1
        else l = m+1
    }
    return -1
}
fun binnarySearchRecursive(a:IntArray, left: Int, right: Int, x: Int): Int{
    if(left > right)return -1
    else{
        val m = (left + right)/2
        if((x==a[m]))return m
        else if(x<a[m])
            return binnarySearchRecursive(a,left,m-1,x)
        else return binnarySearchRecursive(a,m-1,right,x)
    }
}
fun binnarySearchWoReturn(a:IntArray, left: Int, right: Int, x: Int): Int=
    if(left > right) -1
    else{
        val m = (left + right)/2
        if((x==a[m])) m
        else if(x<a[m])
             binnarySearchRecursive(a,left,m-1,x)
        else binnarySearchRecursive(a,m-1,right,x)
    }
fun binnarySearchWReturnOnStart(a:IntArray, left: Int, right: Int, x: Int): Int {
    return if (left > right) -1
    else {
        val m = (left + right) / 2
        if ((x == a[m])) m
        else if (x < a[m])
            binnarySearchRecursive(a, left, m - 1, x)
        else binnarySearchRecursive(a, m - 1, right, x)
    }
}
fun maxOfArray(a: IntArray, left: Int, right: Int): Int { //recursive
    if (left == right) return a[left]
    else {
        val mid = (left + right) / 2
        val maxL = maxOfArray(a, left, mid) //máx da metade esq
        val maxR = maxOfArray(a, mid + 1, right) //máx da metade dta
        return if (maxL > maxR) maxL else maxR
    }
}