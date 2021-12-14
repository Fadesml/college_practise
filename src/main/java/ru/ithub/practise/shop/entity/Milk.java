package ru.ithub.practise.shop.entity;

public class Milk extends Product {
    public Milk(Double amount) {
        super("Молоко", ProductCostType.LITER, 80.0, amount);
    }
}
