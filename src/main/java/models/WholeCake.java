package models;

public class WholeCake extends Cake {

private String shape;
private int sizeInInches;


    public WholeCake(double cost, double price, String type, String ingredients, int quantity, String flavourBase, String toppings, String icingType, String shape, int sizeInInches) {
        super(cost, price, type, ingredients, quantity, flavourBase, toppings, icingType);
    }
    public boolean customImageOption(boolean trueOrFalse){
        return trueOrFalse;
    }
}
