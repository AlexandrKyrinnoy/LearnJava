package com.learn.examples;

import com.learn.classRepository.Box;

/**
 * Created by Owner on 03.11.2017.
 */
public class BoxDemo {

    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        myBox2.width = 5;
        myBox2.height = 10;
        myBox2.depth = 7.5;

        System.out.println("Volume 1: " + myBox.volume());
        System.out.println("Volume 2: " + myBox2.volume());
    }

}
