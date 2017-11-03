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

        myBox.volume();
        myBox2.volume();

    }
}
