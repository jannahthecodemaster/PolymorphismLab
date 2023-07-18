package models;

import interfaces.ISell;
public class Coffee implements ISell {

    public double cost;
    public double price;
    public boolean whippedCream;
    public int noOfSugars;

    public Coffee(double cost, double price, boolean whippedCream, int noOfSugars){
        this.cost = cost;
        this.price = price;
        this.whippedCream = whippedCream;
        this.noOfSugars = noOfSugars;
    }
    public double calculateMargin(){
        return this.price - this.cost;
    }
}
