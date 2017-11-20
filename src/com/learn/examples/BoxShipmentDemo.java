package com.learn.examples;

import com.learn.classRepository.BoxShipment;

/**
 * Created by Owner on 20.11.2017.
 */
public class BoxShipmentDemo {
    public static void main(String[] args) {
        BoxShipment boxShipment1 = new BoxShipment(10, 20, 15, 10, 3.41);
        BoxShipment boxShipment2 = new BoxShipment(2, 3,4, 0.76,1.28);

        double vol;

        vol = boxShipment1.volume();
        System.out.println("At boxShipment1: amount: " + vol + ", wieght: "+ boxShipment1.getWeight() + ", cost: $" + boxShipment1.getCost());

        vol = boxShipment2.volume();
        System.out.println("At boxShipment2: amount: " + vol + ", wieght: "+ boxShipment2.getWeight() + ", cost: $" + boxShipment2.getCost());
    }

}
