val items = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

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
