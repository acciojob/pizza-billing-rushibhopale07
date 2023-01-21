package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    boolean isCheese;
    boolean isTopping;
    boolean isTakeaway;
    boolean isGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isCheese=false;
        this.isTopping=false;
        this.isTakeaway=false;
        this.isGenerated=false;
        this.bill="";
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }else{
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheese){
            this.price=this.price+cheese;
            this.isCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isTopping){
            this.price+=toppings;
            this.isTopping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            this.price+=20;
            this.isTakeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isGenerated) {
            if (isCheese) {
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            }
            if (isTopping) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeaway) {
                this.bill += "Paperbag Added: " + "20" + "\n";
            }
            this.bill += "Total Price: " + price + "\n";
            isGenerated = true;
        }
        return this.bill;
    }
}