package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
    }

    @Override
    public void passenger(int pas) {
    }

    @Override
    public double refuel(double fuel) {
        double price;
        price = fuel * 49;
        return price;
    }
}
