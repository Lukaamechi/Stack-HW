package com.company;
import java.util.Scanner;
import ibadts.StaticStack;
//hw 2
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StaticStack<String> input = new StaticStack<>(5);
        boolean flag = true;
        while (in.hasNextLine() && flag) {
            if (!input.isFull())
                input.push(in.next());
                else
                    flag = false;
        }
        while (!input.isEmpty())
            System.out.println(input.pop());
    }
}
//hw 4

class Main {


    public static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Capacity: ");
        int capacity = sc.nextInt();
        IntStack stack = new IntStack(capacity);
        stack.printStack();

        System.out.println("Command: ");
        String command = sc.next();

        while (!command.equals("exit")) {
            if (command.equals("push")) {
                stack.push(sc.nextInt());
                stack.printStack();
                System.out.println("\n");
            } else if (command.equals("pop")) {
                System.out.println(stack.pop());
                stack.printStack();
                System.out.println("\n");
            } else if (command.equals("isfull")) {
                System.out.println(stack.isFull());
            } else if (command.equals("isempty")) {
                System.out.println(stack.isEmpty());
            }
            System.out.println("Command: ");
            command = sc.next();

        }
    }

}


class IntStack {

    // Fields (Variables)
    int[] array;
    int firstFreeIndex;
    int capacity;


    IntStack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        firstFreeIndex = 0;
    }

    public void push(int item) {

        array[firstFreeIndex] = item;
        firstFreeIndex++;
    }

    public int pop() {
        firstFreeIndex--;
        int valueThatWasPopped = array[firstFreeIndex];
        array[firstFreeIndex] = 0;
        return valueThatWasPopped;
    }

    boolean isEmpty() {
        if (firstFreeIndex == 0) {
            return true;
        } else if (firstFreeIndex != 0) {
            return false;
        }
        return false;
    }

    boolean isFull() {
        if (firstFreeIndex == capacity) {
            return true;
        } else if (firstFreeIndex < capacity) {
            return false;
        }
        return false;
    }

    public void printStack() {
        System.out.println(Arrays.toString(array));
    }


}

