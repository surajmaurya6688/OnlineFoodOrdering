package com.example.demo.entity;

import jakarta.persistence.*;

@Entity(name = "orders")
public class Order {
	public Long getId() {
	    return id;
	}

	public void setId(Long id) {
	    this.id = id;
	}


	public Long getMenuItemId() {
		return menuItemId;
	}
	public void setMenuItemId(Long menuItemId) {
		this.menuItemId = menuItemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long menuItemId;
    private int quantity;
    private double totalPrice;
    
    public Order()
    {
    	System.out.println("Order Table created");
    }
}

