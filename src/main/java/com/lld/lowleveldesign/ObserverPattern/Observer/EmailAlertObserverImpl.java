package com.lld.lowleveldesign.ObserverPattern.Observer;

import com.lld.lowleveldesign.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update(){
        sendMail(emailId, "Product is in stock hurry up");

    }
    public void sendMail(String emailId, String message){
        System.out.println("Email sent to "+ emailId + " with message "+ message);
    }
}