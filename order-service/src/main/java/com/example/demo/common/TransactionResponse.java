package com.example.demo.common;

import com.example.demo.entity.Order;

public class TransactionResponse {
	private Order order;
	private double amount;
	private String transacationId;
	private String message;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransacationId() {
		return transacationId;
	}
	public void setTransacationId(String transacationId) {
		this.transacationId = transacationId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public TransactionResponse(Order order, double amount, String transacationId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transacationId = transacationId;
		this.message = message;
	}
	
}
