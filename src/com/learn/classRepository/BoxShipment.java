package com.learn.classRepository;

/**
 * Created by Owner on 20.11.2017.
 */
public class BoxShipment extends BoxWeight {
    private double cost;

    public BoxShipment(BoxShipment obj) {
        super(obj);
        cost = obj.cost;
    }

    public BoxShipment(double pW, double pH, double pD, double pM, double pC) {
        super(pW, pH, pD, pM);
        cost = pC;
    }

    public BoxShipment() {
        super();
        cost = -1;
    }

    public BoxShipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }

    public double getCost() {
        return cost;
    }
}
