package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;
    private int toppings;
    private boolean ischeese;
    private boolean istoppings;

    public int setPrice(int price) {
        return this.price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    public boolean isIscheese() {
        return ischeese;
    }

    public void setIscheese(boolean ischeese) {
        this.ischeese = ischeese;
    }

    public boolean isIstoppings() {
        return istoppings;
    }

    public void setIstoppings(boolean istoppings) {
        this.istoppings = istoppings;
    }

    public boolean isIspapaerbag() {
        return ispapaerbag;
    }

    public void setIspapaerbag(boolean ispapaerbag) {
        this.ispapaerbag = ispapaerbag;
    }

    public boolean isIsbill() {
        return isbill;
    }

    public void setIsbill(boolean isbill) {
        this.isbill = isbill;
    }

    private boolean ispapaerbag;
    private boolean isbill;
    public Pizza(Boolean isVeg){
       this.isVeg=isVeg;
       if(isVeg)
       {
           this.price=300;
           this.toppings=70;
       }
       else
       {
           this.price=400;
           this.toppings=120;
       }
       this.cheese=80;
        bill="Base Price Of The Pizza: "+price+"\n";
        // your code goes here
    }
    public int getPrice()
    {
        return this.price;
    }
    public void addExtraCheese(){
      if(!ischeese)
      {
          this.price+=this.cheese;
          this.ischeese=true;
      }
    }

    public void addExtraToppings(){
        if(!istoppings)
        {
            this.price+=this.toppings;
            this.istoppings=true;
        }
    }

    public void addTakeaway(){
       if(!ispapaerbag)
       {
           this.price+=20;
           this.ispapaerbag=true;
       }
    }

    public String getBill(){
        // your code goes here
        //Base Price Of The Pizza: 300
        if(!isbill) {
            if (ischeese)
                bill += "Extra Cheese Added: " + cheese + "\n";
            if (istoppings)
                bill += "Extra Toppings Added: " +toppings+ "\n";
            if (ispapaerbag)
                bill += "Paperbag Added: " +20+ "\n";
            this.isbill=true;
        }
       return bill+="Total Price: "+price+"\n";
    }
}
