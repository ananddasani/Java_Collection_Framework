package Basic_CF_Package;

import java.util.Stack;

public class CF6_Stack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        //check stack is empty or not
        if (stack.empty())
            System.out.println("Stack is Empty\n");

        //push element in stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);

        System.out.println("\nPeek element of stack is " + stack.peek());

        System.out.println("popping out one element " + stack.pop());

        System.out.print("\nSearching 100 :: ");
        System.out.println(stack.search(100));
    }
}

/*
OUTPUT

Stack is Empty

[10, 20, 30, 40, 50]

Peek element of stack is 50
popping out one element 50

Searching 100 :: -1
 */
