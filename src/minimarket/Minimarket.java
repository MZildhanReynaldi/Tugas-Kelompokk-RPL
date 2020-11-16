/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Minimarket {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pembuatmakanan pembuatmakanan = new Pembuatmakanan();
        Karyawan BOS = new Karyawan("Dimas","Bos",100000000);
        Stockbarang stockBarang = new Stockbarang();
        
        char pilihan;
        Scanner input = new Scanner(System.in);
        
        System.out.println("==============MENU DESIGN PATTERN============== ");
        System.out.println("A. Builder Pattern ");
        System.out.println("B. Prototype Pattern ");
        System.out.println("C. Composite Pattern ");
        System.out.println("D. Observer Pattern ");
        
        System.out.println("Pilih Menu : ");
        pilihan = input.next().charAt(0);
        
        
        
        if(pilihan == 'A'){
        System.out.println("\n\nBuilder Pattern ");

      Meal vegMeal = pembuatmakanan.prepareVegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " + vegMeal.getCost());

      Meal nonVegMeal = pembuatmakanan.prepareNonVegMeal();
      System.out.println("\n\nNon-Veg Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " + nonVegMeal.getCost());
        }
        if(pilihan == 'B'){
        System.out.println("\n\nPrototype Pattern ");
        TokoBaris.getBaris("Makanan").isibaris();
        TokoBaris.getBaris("Minuman").isibaris();
        TokoBaris.getBaris("Minuman").isibaris();
        TokoBaris.getBaris("Makanan").isibaris();
    
      System.out.println("\n\nPrototype Pattern ");
      TokoBaris.getBaris("Makanan").isibaris();
        TokoBaris.getBaris("Minuman").isibaris();
        TokoBaris.getBaris("Minuman").isibaris();
        TokoBaris.getBaris("Makanan").isibaris();
        }
        
        if(pilihan == 'C'){
        System.out.println("\n\nComposite Pattern ");
         
        Karyawan headPenjualan = new Karyawan("Zildhan", "Kepala Penjualan",5000000);
        
        Karyawan headPemasaran = new Karyawan("Galih","Kepala Pemasaran",5000000);
        
        Karyawan Pemasaran1 = new Karyawan("Andri","Pemasaran",1000000);
        Karyawan Pemasaran2 = new Karyawan("Lina","Pemasaran",1000000);
        
        Karyawan Penjualan1 = new Karyawan("Mery","Penjualan",1000000);
        Karyawan Penjualan2 = new Karyawan("Rizky","Penjualan",1000000);
        BOS.add(headPenjualan);
        BOS.add(headPemasaran);
        
        headPemasaran.add(Pemasaran1);
        headPemasaran.add(Pemasaran2);
        
        headPenjualan.add(Penjualan1);
        headPenjualan.add(Penjualan2);
        
        System.out.println(BOS);
        
        for(Karyawan headKaryawan : BOS.getSubordinates()){
            System.out.println();
            System.out.println(headKaryawan);
     
            for(Karyawan Karyawan : headKaryawan.getSubordinates()){
                System.out.println(" - "+Karyawan);
            
    }
    
}
        }
        
        if(pilihan == 'D'){
        System.out.println("\n\nObserver Pattern ");
        
        Stockobserver observer1 = new Stockobserver(stockBarang);
        
        stockBarang.setTehpucukPrice(5000.00);
        stockBarang.setNescafePrice(8500.60);
        stockBarang.setOnigiriPrice(10000.40);
        
        Stockobserver observer2 = new Stockobserver(stockBarang);
        
        stockBarang.setTehpucukPrice(5000.00);
        stockBarang.setNescafePrice(8500.60);
        stockBarang.setOnigiriPrice(10000.40);
        
        stockBarang.unregister(observer1);
        
        stockBarang.setTehpucukPrice(5000.00);
        stockBarang.setNescafePrice(8500.60);
        stockBarang.setOnigiriPrice(10000.40);
        
        Runnable getTehpucuk = new Ambilstock(stockBarang, 2, "Tehpucuk", 5000.00);
        Runnable getNescafe = new Ambilstock(stockBarang, 2, "Nescafe", 8500.60);
        Runnable getOnigiri = new Ambilstock(stockBarang, 2, "Onigiri", 10000.40);
        
        new Thread(getTehpucuk).start();
        new Thread(getNescafe).start();
        new Thread(getOnigiri).start();
    }
        else{
            System.out.println("Menu tidak ditemukan");
        }
    }
}