/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

/**
 *
 * @author Rizki Aprido Rosga
 */
public class Stockobserver implements Observer {
    
    private double tehpucukPrice;
    private double nescafePrice;
    private double onigiriPrice;
    
    public static int observerIDTracker = 0;
    
    private int observerID;
    
    private Subject stockBarang;
    
    public Stockobserver(Subject stockBarang){
        
        this.stockBarang = stockBarang;
        
        this.observerID = ++observerIDTracker;
        
        System.out.println("New Observer " + this.observerID);
        
        stockBarang.register(this);
    }

    @Override
    public void update(double tehpucukPrice, double nescafePrice, double onigiriPrice) {
        
        this.tehpucukPrice = tehpucukPrice;
        this.nescafePrice = nescafePrice;
        this.onigiriPrice = onigiriPrice;
        
        printHarga();
    
    }

    private void printHarga() {
        
        System.out.println(observerID + "\nTeh Pucuk : " + tehpucukPrice + "\nNescafe : " + nescafePrice + "\nOnigiri : " + onigiriPrice + "\n");
                
    }

    
}
