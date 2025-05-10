package com.trading.domain;

import java.util.concurrent.atomic.AtomicInteger;

public class TradeOrder {
    private long id;
    private String orderId;
    private String symbol;
    private AtomicInteger quantity;
    private double price;
    private String side;
    private long accountId;
    private TradeOrderType orderType;
    private double stopLossPrice;
    private TradeOrderStatus tradeOrderStatus;

    public TradeOrder() {
    }

    public boolean reduceQuantity(int qty) {
        synchronized (quantity) {
            if(quantity.get() >= qty) {
                quantity.addAndGet(-qty);
                return true;
            } else {
                return false;
            }
        }
    }

    public long getId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity.get();
    }

    public double getPrice() {
        return price;
    }

    public String getSide() {
        return side;
    }

    public long getAccountId() {
        return accountId;
    }

    public TradeOrderType getOrderType() {
        return orderType;
    }

    public double getStopLossPrice() {
        return stopLossPrice;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setQuantity(AtomicInteger quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public void setOrderType(TradeOrderType orderType) {
        this.orderType = orderType;
    }

    public void setStopLossPrice(double stopLossPrice) {
        this.stopLossPrice = stopLossPrice;
    }

    public TradeOrderStatus getTradeOrderStatus() {
        return tradeOrderStatus;
    }

    public void setTradeOrderStatus(TradeOrderStatus tradeOrderStatus) {
        this.tradeOrderStatus = tradeOrderStatus;
    }


}
