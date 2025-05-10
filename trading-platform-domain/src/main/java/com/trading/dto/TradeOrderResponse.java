package com.trading.dto;

import com.trading.domain.TradeOrderStatus;

public class TradeOrderResponse {
    private String orderId;
    private String symbol;
    private String side;
    private double price;
    private int quantity;
    private String accountId;
    private TradeOrderStatus status;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public TradeOrderStatus getStatus() {
        return status;
    }

    public void setStatus(TradeOrderStatus status) {
        this.status = status;
    }
}
