/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

import java.util.ArrayList;

/**
 *
 * @author Rizki Aprido Rosga
 */
public class Stockbarang implements Subject{
    
    private ArrayList<Observer> observers;
    private double tehpucukPrice;
    private double nescafePrice;
    private double onigiriPrice;
    
    public Stockbarang(){
        
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
       observers.add(newObserver); 
                
    }

    @Override
    public void unregister(Observer deleteObserver) {
       int observerIndex = observers.indexOf(deleteObserver);
       
       System.out.println("Observer " + (observerIndex+1) + " deleted");
       
       observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        
        for(Observer observer : observers){
            
            observer.update(tehpucukPrice, nescafePrice, onigiriPrice);
        }
    }
    
    public void setTehpucukPrice(double newTehpucukPrice){
        this.tehpucukPrice = newTehpucukPrice;
        notifyObserver();
    }
    public void setNescafePrice(double newNescafePrice){
        this.nescafePrice = newNescafePrice;
        notifyObserver();
    }
    public void setOnigiriPrice(double newOnigiriPrice){
        this.onigiriPrice = newOnigiriPrice;
        notifyObserver();
    }
}
