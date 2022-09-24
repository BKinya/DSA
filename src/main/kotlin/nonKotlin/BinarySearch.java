package nonKotlin;

/**
 * use Binary search when searching SORTED data esp. when memory is compact and limited
 * Time complexity: O(log n) where n is the number of elements in the array
 * Space complexity: O(1)
 * Binary search is an example of divide and conquer strategy. It can be implemented using recursion as well.
 */
public class BinarySearch {
    private int[] sortedArray;

    public BinarySearch(int[] numbers) {
        sortedArray = numbers;
    }

    public boolean search(int p) {
        boolean found = false;
        int higher = sortedArray.length - 1;
        int lower = 0;
        while (lower < higher) {
            int mid = (higher + lower) / 2;
            if (p == sortedArray[mid]) {
                found = true;
                break;
            }
            if (p > sortedArray[mid]) {
                lower = mid + 1;
            } else {
                higher = mid - 1;
            }
        }
        return found;
    }
}
