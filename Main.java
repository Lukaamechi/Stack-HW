package com.company;
import java.util.Scanner;
import ibadts.StaticStack;

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
