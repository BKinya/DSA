package nonKotlin;

import stack.LinkedListImpl;

public class Main {
    public static void main(String args[]) {
        LinkedListImpl stack = new LinkedListImpl();
        stack.push(4);
        stack.push(11);
        stack.push(78);
        stack.push(9);

        stack.display();

        stack.pop();
        stack.pop();

        System.out.println("Stack empty " +stack.isEmpty());
        System.out.println("Stack peek " +stack.peek());

        stack.display();
    }
}
