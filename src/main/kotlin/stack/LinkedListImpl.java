package stack;

/**
 * Stack implementation using singly linked list
 * Linked list allocates memory dynamically
 */
public class LinkedListImpl {

    private Node top;
    private class Node{
        int data;
        Node next;
    }

    public LinkedListImpl(){
        top = null;
    }

    public void push(int num){
        Node newNode = new Node();
        newNode.data = num;

        // put top reference to the newNode link
        newNode.next = top;
        // Update top reference
        top = newNode;

    }

    public int pop(){
        if (isEmpty()){
            System.exit(1);
        }
        Node oldTop = top;
        top = oldTop.next;
        return oldTop.data;

    }
    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        return top.data;
    }

    public void display(){
        Node tempNode = top;
        while (tempNode != null){
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }
}
