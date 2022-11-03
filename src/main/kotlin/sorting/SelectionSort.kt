package sorting

fun less(a: Int, b: Int): Boolean = a < b

fun exchange(array: Array<Int>, i: Int, j: Int){
    val swap = array[i]
    array[i] = array[j]
    array[j] = swap

}