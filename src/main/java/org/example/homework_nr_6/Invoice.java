package org.example.homework_nr_6;

public class Invoice {

    private String model;
    private String description;
    private int qty;
    private double price;

    public Invoice(String model, String description, int qty, double price) {
        this.model = model;
        this.description = description;
        if(qty < 0) {
            this.qty = 0;
        } else {
            this.qty = qty;
        }
        if(price < 0) {
            this.price = 0.00;}
        else {
            this.price = price;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty < 0) {
            this.qty = 0;}
        else {
            this.qty = qty;
        }
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            this.price = 0.00;}
        else {
            this.price = price;
            }
        }


    void getAmount() {
        double total;
        total = this.price * this.qty;
        System.out.println("Total:" + total);
    }


    public static void main(String[] args) {

        Invoice receipt = new Invoice("TV", "Samsung", 1, 7999.00);

        Invoice receipt2 = new Invoice("Phone", "Iphone 7", -1,9899.00);

        System.out.println(receipt.qty); //Проверка расчёта Total
        receipt2.getAmount(); //Проверка ввода отрицательного значения количества товара

    }
}



