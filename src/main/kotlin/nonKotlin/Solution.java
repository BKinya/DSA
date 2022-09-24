package nonKotlin;

import java.util.ArrayList;

public class Solution {
    public static int calPoints(String[] ops) {
        int result = Integer.MIN_VALUE;
        result = 0;
        ArrayList<Integer> scores = new ArrayList<Integer>();
        for (String op : ops) {
            if (op.equalsIgnoreCase("c")
                    || op.equalsIgnoreCase("d")
                    || op.equalsIgnoreCase("+")) {

                if (op.equalsIgnoreCase("c")) {
                    int length = scores.size();
                    int last = scores.get(length - 1);
                    result = result - last;
                    scores.remove(length - 1);
                }

                if (op.equalsIgnoreCase("d")) {
                    int length = scores.size();
                    int num = scores.get(length - 1);
                    int dou = num * 2;
                    scores.add(dou);
                    result = result + dou;
                }
                if (op.equalsIgnoreCase("+")) {
                    int length = scores.size();
                    int num = scores.get(length - 1);
                    int num1 = scores.get(length - 2);
                    int sum = num + num1;
                    result = result + sum;
                    scores.add(sum);

                }
            } else {
                int num = Integer.parseInt(op);
                scores.add(num);
                result = result + num;
            }
        }

        return result;
    }
}
