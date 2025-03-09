package com.lld.lowleveldesign.ObserverPattern;
/**
 * The Observer design pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
 The advantages of using the Observer design pattern include:
 Loose Coupling: The observer and observable are loosely coupled. The observable does not need to know the details of the observers, only that they implement a specific interface. This makes the system more flexible and easier to maintain.
 Dynamic Relationships: Observers can be added or removed at runtime, allowing for dynamic changes in the relationships between objects.
 Broadcast Communication: The observable can notify all registered observers with a single method call, making it easy to broadcast updates to multiple objects.
 Separation of Concerns: The pattern promotes separation of concerns by allowing different parts of the application to focus on their specific tasks. Observables handle state changes, while observers handle the response to those changes.
 Scalability: The pattern can easily scale to support any number of observers, making it suitable for applications where the number of dependent objects can vary.
 Reusability: Observers and observables can be reused across different parts of the application or even in different projects, as long as they adhere to the defined interfaces.

**/
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