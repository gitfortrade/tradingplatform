package com.trading.processor;

import com.trading.domain.TradeOrder;

public class DerivativeTradeOrderProcessor implements TradeOrderProcessor {
    private final TradeOrderProcessingService tradeOrderProcessingService;

    public DerivativeTradeOrderProcessor(TradeOrderProcessingService tradeOrderProcessingService) {
        this.tradeOrderProcessingService = tradeOrderProcessingService;
    }

    @Override
    public void processTradeOrder(TradeOrder tradeOrder) {
        tradeOrderProcessingService.processTradeOrder(tradeOrder);
    }
}
