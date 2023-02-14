package EstacaoMeteorologica;

import java.util.ArrayList;

public class Observable extends java.util.Observable {
    private ArrayList <Observer> observers;
    boolean changed;

    public Observable(){
        observers = new ArrayList<Observer>();
    }
    public void setChanged(){
        changed = true;
    }
    public void addObserver(Observer o){
        observers.add(o);
    }
    public void deleteObserver(Observer o){
        int i = observers.indexOf(o);
        if(i>0)
        observers.remove(o);
    }
    public void notifyObserver(Object arg){
        if(changed){
            for(Observer j : observers){
                j.update(this, arg);
            }
            changed = false;
        }
    }
    public void notifyObserver(){
        notifyObserver(null);
    }
}
