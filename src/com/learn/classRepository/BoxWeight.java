package com.learn.classRepository;

/**
 * Created by Owner on 08.11.2017.
 */
public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double pWidth, double pHeight, double pDepth, double pWeight) {
        super(pWidth, pHeight, pDepth);
        weight = pWeight;
    }

    public BoxWeight(BoxWeight obj) {
        super(obj);
        weight = obj.weight;
    }

    public BoxWeight() {
        super();
        weight = -1;
    }

    public BoxWeight(double len, double m){
        super(len);
        weight = m;
    }

    public double getWeight() {
        return this.weight;
    }
}
