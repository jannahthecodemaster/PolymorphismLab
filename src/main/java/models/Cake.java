package models;

public abstract class Cake extends Confectionary{

    private String flavourBase;
    private String toppings;
    private String icingType;


    public Cake(double cost, double price, String type, String ingredients, int quantity, String flavourBase, String toppings, String icingType) {
        super(cost, price, type, ingredients, quantity);
        this.flavourBase = flavourBase;
        this.toppings = toppings;
        this.icingType = icingType;
    }

    public String addMessage(){
        return "Happy Birthday John!";
        }

    public String addMessage(String proudMessage){
        return "We are so proud of you!";
    }

    public String addMessage(String anniversaryMessage, String name){
        return "Happy Anniversary" + "Jannah!";
    }

}
