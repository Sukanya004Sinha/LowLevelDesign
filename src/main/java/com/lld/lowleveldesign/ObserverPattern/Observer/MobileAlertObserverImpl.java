package com.lld.lowleveldesign.ObserverPattern.Observer;

import com.lld.lowleveldesign.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
   StockObservable observable;
    public MobileAlertObserverImpl(String emailId, StockObservable observable){
        this.userName = emailId;
        this.observable = observable;
    }
    public void update(){
      sendMsgOnMobile(userName, "Product is in stock hurry up");

    }

    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("Message sent to "+ userName);
        //send the email to the actual user;
    }

}
