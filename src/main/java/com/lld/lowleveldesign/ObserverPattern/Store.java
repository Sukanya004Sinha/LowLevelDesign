package com.lld.lowleveldesign.ObserverPattern;

        import com.lld.lowleveldesign.ObserverPattern.Observable.IphoneObservableImpl;
        import com.lld.lowleveldesign.ObserverPattern.Observable.StockObservable;
        import com.lld.lowleveldesign.ObserverPattern.Observer.EmailAlertObserverImpl;
        import com.lld.lowleveldesign.ObserverPattern.Observer.MobileAlertObserverImpl;
        import com.lld.lowleveldesign.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("observer1@gmail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("observer2@yahoo.com", iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("observer3@outlook.com", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);
        iphoneObservable.setStockCount(10);
    }
}

        //Make sure that the `EmailAlertObserverImpl` constructor and `IphoneObservableImpl` class have the appropriate methods and parameters as used in the `Store` class.