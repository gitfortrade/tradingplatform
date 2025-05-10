package com.trading.exception;

public class InsufficientFundsException extends Throwable {
    public InsufficientFundsException(String s) {
        System.out.println(s);
    }
}
