package com.learn.examples;

import com.learn.classRepository.FixedStack;

/**
 * Created by Owner on 21.11.2017.
 */
public class IFTestDemo {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for(int i=0; i<5; i++) myStack1.push(i);
        for(int i=0; i<8; i++) myStack2.push(i);

        System.out.println("Stack in myStack1:\t");
        for(int i=0; i<5; i++){
            System.out.print(myStack1.pop()+" ");
        }
        System.out.println("\nStack in myStack2:\t");
        for(int i=0; i<8; i++) {
            System.out.print(myStack2.pop()+" ");
        }
    }
}
