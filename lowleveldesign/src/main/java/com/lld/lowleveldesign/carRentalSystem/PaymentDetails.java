package com.lld.lowleveldesign.carRentalSystem;

public class PaymentDetails {
    private String paymentId;
    private String paymentMode;
    private String paymentStatus;

    public PaymentDetails(String paymentId, String paymentMode, String paymentStatus) {
        this.paymentId = paymentId;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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
