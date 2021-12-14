package ru.ithub.practise.shop.entity;

public class Flour extends Product {
    public Flour(Double amount) {
        super("Мука", ProductCostType.KILOGRAM, 50.0, amount);
    }
}
