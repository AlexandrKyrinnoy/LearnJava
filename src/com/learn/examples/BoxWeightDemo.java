package com.learn.examples;

import com.learn.classRepository.BoxWeight;

/**
 * Created by Owner on 08.11.2017.
 */
public class BoxWeightDemo {
    public static void main(String[] args) {

        BoxWeight myBoxWeight = new BoxWeight(10,15,20,0.360);

//        System.out.println("Volume myWeightBox: " + myBoxWeight.volume() + ", weight: "+myBoxWeight.getWeight());
        System.out.println("Weight myWeightBox: " + myBoxWeight.getWeight() + ", \nVolume myWeightBox: ");
        myBoxWeight.volume();

    }
}
