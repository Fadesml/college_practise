package ru.ithub.practise.shop.entity;

public class Flour extends Product {
    public Flour(Integer amount) {
        super("Мука", ProductCostType.KILOGRAM, 35.0, amount);
    }
}
