package com.lld.lowleveldesign.carRentalSystem;

public class Payment {
private String paymentId;
    private double amount;
    private String paymentMethod; // e.g., Credit Card, Debit Card, PayPal
    private String status; // e.g., Completed, Pending, Failed
    private String transactionId;

    public Payment(String paymentId, double amount, String paymentMethod, String status, String transactionId) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.transactionId = transactionId;
    }

    // Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
