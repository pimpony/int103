

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Live-
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    private int promotion;
    private int sellAmount;

    public Product(String name, double price, int quantity) {
        if (name == null) {
            this.name = "";
        } else {
            this.name = name;
        }

        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }

        if (quantity < 0) {
            this.quantity = 10;
        } else {
            this.quantity = quantity;
        }
        promotion = 0;
        sellAmount = 0;
        
    }

    public int getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(int sellAmount) {
        this.sellAmount = sellAmount;
    }

    public int getPromotion() {
        return promotion;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", quantity=" + quantity + ", promotion=" + promotion + ", sellAmount=" + sellAmount + '}';
    }
    
}
