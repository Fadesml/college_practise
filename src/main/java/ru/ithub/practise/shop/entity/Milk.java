package ru.ithub.practise.shop.entity;

public class Milk extends Product {
    public Milk(Integer amount) {
        super("Молоко", ProductCostType.LITER, 80.0, amount);
    }
}
