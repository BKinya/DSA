val mmap = mutableMapOf<Int, Int>()
fun main() {
    println("weighted list $items")
    union2(4, 3)
    println("weighted list $items")
    union2(3, 8)
    println("weighted list $items")
    union2(6, 5)
    println("weighted list $items")
    union2(9, 4)
    println("weighted list $items")
    union2(2, 1)
    println("weighted list $items")
    union2(5, 0)
    println("weighted list $items")
    union2(7, 2)
    println("weighted list $items")
    union2(6, 1)
    println("weighted list $items")
    union2(7, 3)
    println("weighted list $items")

}

fun find(p: Int){

}
fun root1(num: Int): Int {
    // id[i] is the parent of i
    var i = num
    while (i != items[i]) {
        items[i] = items[items[i]]
        i = items[i]
    }
    return i
}
fun union2(p: Int, q: Int) {
    val pRoot = root(p)
    val qRoot = root(q)
    if (isConnected(p, q)){

    }else{
        val pSize = mmap[pRoot] ?: 1
        val qSize = mmap[qRoot] ?: 1
        println("9 is shorter? p = $pSize q = $qSize")
        if (pSize >= qSize){
            items[qRoot] = pRoot
            mmap[pRoot] = pSize + qSize
            println("9 is shorter? p = ${ mmap[pRoot]} q = $qSize")
        }else{
            items[pRoot] = qRoot
            mmap[qRoot] = pSize + qSize
        }

    }
}