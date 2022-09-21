val items = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
fun main(args: Array<String>) {
    // Create an empty array of integers
    // Set the id of each object to itself... May be the vale coz the ids will overwrite the content

    println("Item is ${items[5]}")
    // Find: Check whether p and q are in the same component: Are they equal
    val result = checkConnected(7, 4)
    println("connected => $result")
    // Union:
    union(4, 3)
    println("new array => $items")
    union(3, 8)
    println("new array => $items")
    union(6, 5)
    println("new array => $items")
    union(9, 4)
    println("new array => $items")
    union(2, 1)
    println("new array => $items")
    union(5, 0)
    println("new array => $items")
    union(7, 2)
    println("new array => $items")
    union(6, 1)
    println("new array => $items")

    // find cost
    // Cost: Quadratic cost which doesn't scale well
}

fun checkConnected(p: Int, q: Int) = items[p] == items[q]

fun union(p: Int, q: Int){
    val pId = items[p]
    val qid = items[q]
    if (!checkConnected(p, q)) {
        for (i in items.indices) {
            if (items[i] == pId){
                items[i] = qid
            }
        }
    }
}
