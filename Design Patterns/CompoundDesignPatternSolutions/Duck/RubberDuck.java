package CompoundDesignPatternSolutions.Duck;

import CompoundDesignPatternSolutions.Observable.Observable;
import CompoundDesignPatternSolutions.Observer.Observer;
import CompoundDesignPatternSolutions.Quackable.Quackable;

public class RubberDuck implements Quackable {
    private Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
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
        return "Rubber Duck";
    }
    
}
