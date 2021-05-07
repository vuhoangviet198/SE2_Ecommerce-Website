/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sontriplelift
 */
public class Order extends Product{
    private int orderID;
    private int quantity;
    private String totalPrice;
    private Users user;

    public Order() {
    }
    
    public Order(int orderID, String name, String price ,int quantity, String totalPrice) {
        super(name, price);
        this.orderID = orderID;
        this.quantity = quantity;
        this.totalPrice = totalPrice;        
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    public String getUsername() {
        return getUser().getUsername();
    }
    
    public void setUsername(String username) {
        username = getUsername();
    }
    @Override
    public String toString() {
        
        return "Order{" + "orderID=" + orderID + ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", user=" + user + '}';
    }
}
