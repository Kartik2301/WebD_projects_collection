package CompoundDesignPatternSolutions.Duck;

import CompoundDesignPatternSolutions.Observable.Observable;
import CompoundDesignPatternSolutions.Observer.Observer;
import CompoundDesignPatternSolutions.Quackable.Quackable;

public class DuckCall implements Quackable {
    private Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Duck Call";
    }
    
}
