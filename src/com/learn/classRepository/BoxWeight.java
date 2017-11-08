package com.learn.classRepository;

/**
 * Created by Owner on 08.11.2017.
 */
public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double pWidth, double pHeight, double pDepth, double pWeight) {
        width = pWidth;
        height = pHeight;
        depth = pDepth;
        weight = pWeight;
    }

    public double getWeight() {
        return this.weight;
    }
}
