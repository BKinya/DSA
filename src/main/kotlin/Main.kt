import sorting.exchange
import sorting.less

val unsortedArray = arrayOf(11, 89, 7, 12, 45, 77, 45, 3, 2, 12, 7)
fun main(){
    println("Getting organised!!!")
    for (i in unsortedArray.indices){
        var min = i
        for (j in i+1 until unsortedArray.size){
            if (less(unsortedArray[j], unsortedArray[min])){
                min = j
            }
        }
        exchange(unsortedArray, i, min)
    }
    unsortedArray.forEach {
        print("$it ,")
    }
}