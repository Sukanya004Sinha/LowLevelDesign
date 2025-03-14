package com.lld.lowleveldesign.ObserverPattern.Observable;

import com.lld.lowleveldesign.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;
  @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }
    @Override
    public void remove(NotificationAlertObserver  observer){
        observerList.remove(observer);
    }


   @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }


    public void setStockCount(int newStockAdded){
        if(stockCount ==0){
            notifySubscribers();
        }
        this.stockCount = newStockAdded;
    }
    public int getStockCount(){
        return stockCount;
    }
}
