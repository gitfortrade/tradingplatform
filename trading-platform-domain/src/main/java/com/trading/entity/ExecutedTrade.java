package com.trading.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "executed_trade")
public class ExecutedTrade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private TradeOrderEntity buyOrder;

    @ManyToOne
    private TradeOrderEntity sellOrder;

    private Double executedPrice;
    private Integer quantity;
    private LocalDateTime executedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TradeOrderEntity getBuyOrder() {
        return buyOrder;
    }

    public void setBuyOrder(TradeOrderEntity buyOrder) {
        this.buyOrder = buyOrder;
    }

    public TradeOrderEntity getSellOrder() {
        return sellOrder;
    }

    public void setSellOrder(TradeOrderEntity sellOrder) {
        this.sellOrder = sellOrder;
    }

    public Double getExecutedPrice() {
        return executedPrice;
    }

    public void setExecutedPrice(Double executedPrice) {
        this.executedPrice = executedPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getExecutedAt() {
        return executedAt;
    }

    public void setExecutedAt(LocalDateTime executedAt) {
        this.executedAt = executedAt;
    }
}

