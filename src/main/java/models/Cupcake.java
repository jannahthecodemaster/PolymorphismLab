package models;

public class Cupcake extends Cake{

    private boolean sprinkles;

    public Cupcake(double cost, double price, String type, String ingredients, int quantity, String flavourBase, String toppings, String icingType, boolean sprinkles) {
        super(cost, price, type, ingredients, quantity, flavourBase, toppings, icingType);
        this.sprinkles = false;
    }
    public String addFilling(String filling){
        return filling;
    }
}
