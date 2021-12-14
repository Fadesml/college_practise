package ru.ithub.practise.shop.entity;

public class Egg extends Product {
    public Egg(Integer amount) {
        super("Яйцо", ProductCostType.UNIT, 10.0, amount);
    }
}
