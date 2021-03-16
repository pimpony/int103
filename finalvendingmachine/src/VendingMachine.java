

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Live-
 */
public class VendingMachine {
    private Product[] products;
    private long machineId;
    private int productCounting;
    private double machineMoney;
    private double customerMoney;

    public VendingMachine(Product products, long machineId, int numberOfProducts, int money) {
        if (numberOfProducts > 15) {
            this.products = new Product[15];
        } else if (numberOfProducts < 1) {
            this.products = new Product[1];
        } else {
            this.products = new Product[numberOfProducts];
        }
        
        this.products[0] = products;

        if (money < 0) {
            this.machineMoney = 1000;
        } else {
            this.machineMoney = money;
        }
        this.machineId = machineId;
        this.productCounting = 1;
        this.customerMoney = 0;
    }

    public boolean isFull() {
        return productCounting == products.length && products != null;
    }

    public boolean addProduct(String name, double price, int quantity) {
        if (isFull() || name == null || price < 0 || quantity < 0) {
            return false;
        } else {
            products[productCounting] = new Product(name, price, quantity);
            productCounting++;
            return true;
        }
    }

    public boolean addProduct(Product p) {
        if (isFull() || p == null) {
            return false;
        } else {
            products[productCounting] = p;
            productCounting++;
            return true;
        }
    }

    public boolean addPromotion(int slot, int amount) {
        if (amount > products[slot - 1].getPrice() && products[slot - 1] == null) {
            return false;
        } else {
            products[slot - 1].setPromotion(amount);
            return true;
        }
    }

    public boolean insertMoney(double amount) {
        if (amount > 0) {
            this.customerMoney += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean buy(int slot, int amount) {
        if (amount > products[slot - 1].getQuantity() || products[slot - 1] == null || (amount * products[slot - 1].getPrice()) > this.customerMoney) {
            return false;
        } else {
            double price = (amount * (products[slot - 1].getPrice() - products[slot-1].getPromotion()));

            this.customerMoney -= price;
            this.machineMoney += price;
            products[slot - 1].setQuantity(products[slot - 1].getQuantity() - amount);        // products[slot-1].quantity -= amount;  (code แบบเดียวกันแต่มันเรียกตรงๆไม่ได้เลยต้องเขียนเยอะหน่อย**ตัวแปรเป็น private)             
            products[slot - 1].setSellAmount(products[slot - 1].getSellAmount() + amount);  // products[slot-1].sellAmount += amount;(code แบบเดียวกันแต่มันเรียกตรงๆไม่ได้เลยต้องเขียนเยอะหน่อย**ตัวแปรเป็น private)             
            return true;
        }

    }

    public double returnMoney() {
        double temp = this.customerMoney;
        this.customerMoney = 0;
        return temp;
    }

    public boolean expand(int size) {
        if (this.productCounting == 15 || size < 1) {
            return false;
        } else {
            Product[] temp;
            if (size + products.length > 15) {
                temp = new Product[15];

            } else {
                temp = new Product[size + products.length];
            }
            System.arraycopy(products, 0, temp, 0, products.length);
            products = temp;
            return true;
        }
    }

    public Product getProduct(int slot) {
        if (products[slot - 1] == null) {
            return null;
        } else {
            return products[slot - 1];
        }
    }

    public boolean deleteProduct(int slot) {
        if (products[slot - 1] == null) {
            return false;
        } else {
            products[slot - 1] = null;
            for (int i = slot - 1; i < productCounting - 1; i++) {
                products[i] = products[i + 1];
                products[i + 1] = null;
            }
            productCounting--;
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder s1 = new StringBuilder();
        s1.append("VendintMachine ID : " + this.machineId + "\n");
        s1.append("Total Product     : " + this.productCounting + "\n");
        s1.append("Machine Money     : " + this.machineMoney + "\n");
        s1.append("Customer Money    : " + this.customerMoney + "\n");
        s1.append("================================================================================\n\n");
        for (int i = 0; i < this.productCounting; i++) {
            s1.append(products[i].getName() + "\n");
            s1.append("price      : " +products[i].getPrice() + "\n");
            s1.append("Quantity   : " +products[i].getQuantity() + "\n");
            s1.append("SellAmount : " +products[i].getSellAmount() + "\n\n");
        }
        s1.append("================================================================================\n");
        
        return s1.toString();
    }
}
