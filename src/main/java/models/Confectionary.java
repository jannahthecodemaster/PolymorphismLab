package models;

import interfaces.ISell;

public abstract class Confectionary implements ISell {

    protected double cost;
    protected double price;
    protected String type;
    protected String ingredients;
    protected int quantity;

    public Confectionary(double cost, double price, String type, String ingredients, int quantity) {
        this.cost = cost;
        this.price = price;
        this.type = type;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }
    public double calculateMargin(){
        return this.price - this.cost;
    }
}
