package com.learn.examples;

import com.learn.classRepository.Box;

/**
 * Created by Owner on 03.11.2017.
 */
public class BoxDemo {

    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.width * myBox.height * myBox.depth;

        System.out.println("Volume : " + vol);


    }
}
