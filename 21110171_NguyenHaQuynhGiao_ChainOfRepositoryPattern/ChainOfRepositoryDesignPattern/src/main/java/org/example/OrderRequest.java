package org.example;

public class OrderRequest {
    private int amount;
    private String orderDetails;

    public OrderRequest(int amount, String orderDetails) {
        this.amount = amount;
        this.orderDetails = orderDetails;
    }

    public int getAmount() {
        return amount;
    }
}
