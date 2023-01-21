package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraToppings();
        addExtraCheese();
        // your code goes here
    }
}
