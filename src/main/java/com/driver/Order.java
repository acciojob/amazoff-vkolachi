package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Order(String id, int deliveryTime) {
        this.id = id;
        this.deliveryTime = deliveryTime;
    }

//    public Order(String id, String deliveryTime) {
//
//        // The deliveryTime has to converted from string to int and then stored in the attribute
//        //deliveryTime  = HH*60 + MM
//    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
