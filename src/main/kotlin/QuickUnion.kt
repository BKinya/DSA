val numbers = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
fun main() {
    val root  = root(7)
    println("Root of 7 => $root")
    // find
    val isConnected = isConnected(3, 5)
    println("is connected $isConnected")
    // union
    union1(4, 3)
    println("new list $numbers")
    union1(3, 8)
    println("new list $numbers")
    union1(6, 5)
    println("new list $numbers")
    union1(9, 4)
    println("new list $numbers")
    union1(2, 1)
    println("new list $numbers")
    println("is connected ${isConnected(8, 9)}")
    println("is connected ${isConnected(5, 4)}")
    println("new list $numbers")
    union1(5, 0)
    println("new list $numbers")
    union1(7, 2)
    println("new list $numbers")
    union1(6, 1)
    println("new list $numbers")
    union1(7, 3)
}

fun root(num: Int): Int {
    // id[i] is the parent of i
    var i = num
    while (i != numbers[i]) {
        i = numbers[i]
    }
    return i
}

fun isConnected(p: Int, q: Int) = root(q) == root(p)

fun union1(p: Int, q: Int) {
    val pRoot = root(p)
    val qRoot = root(q)
    numbers[pRoot] = qRoot

}