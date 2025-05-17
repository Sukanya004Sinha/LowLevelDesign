package com.lld.lowleveldesign.carRentalSystem;

public class PaymentMode {
    private String paymentMode;
    private String paymentStatus;

    public PaymentMode(String paymentMode, String paymentStatus) {
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
