package nonKotlin;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] ops = {"5"};

//       System.out.println(Solution.calPoints(ops));
        int[] numbers = {21, 37, 44, 47, 59, 61, 73, 77, 81, 85, 87, 89, 93};
        BinarySearch binarySearch = new BinarySearch(numbers);

        boolean result = binarySearch.search(79);
        System.out.println("result is " + result);
    }
}
