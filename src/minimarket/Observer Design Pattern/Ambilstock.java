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
import java.text.DecimalFormat;

public class Ambilstock implements Runnable {
    
    private int startTime;
    private String stock;
    private double harga;
    
    private Subject stockBarang;
    
    public Ambilstock(Subject stockBarang, int newStartTime, String newStock, double newPrice){
        
        this.stockBarang = stockBarang;
        
        startTime = newStartTime;
        
        stock = newStock;
        harga = newPrice;
        
        
    }

    @Override
    public void run() {
        
        for(int i = 1; i <=10 ; i++){
            try{
                Thread.sleep(2000);
            }
            
            catch(InterruptedException e){}
            
            double randNum = (Math.random() * (.06)) - .03;
            
            DecimalFormat df = new DecimalFormat("#.##");
            
            harga = Double.valueOf(df.format((harga + randNum)));
            
            if(stock == "Tehpucuk") ((Stockbarang)stockBarang).setTehpucukPrice(harga);
            if(stock == "Nescafe") ((Stockbarang)stockBarang).setNescafePrice(harga);
            if(stock == "Onigiri") ((Stockbarang)stockBarang).setOnigiriPrice(harga);
            
            System.out.println(stock + ": " + df.format((harga + randNum))+ " " + df.format(randNum));
            
            System.out.println();
            
        }
        
    }
    
}
