package ru.ithub.practise.shop.entity;

public abstract class Product {
    protected String name;
    protected ProductCostType costType;
    protected Double cost;
    protected Integer amount;

    public Product(String name, ProductCostType costType, Double cost, Integer amount) {
        this.name = name;
        this.costType = costType;
        this.cost = cost;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public ProductCostType getCostType() {
        return costType;
    }

    public Double getCost() {
        return cost;
    }

    public Double getTotalCost() {
        return cost * amount;
    }

    public Integer getAmount() {
        return amount;
    }
}
