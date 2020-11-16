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
public class Minimarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Builder Pattern ");
        Pembuatmakanan pembuatmakanan = new Pembuatmakanan();

      Meal vegMeal = pembuatmakanan.prepareVegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " + vegMeal.getCost());

      Meal nonVegMeal = pembuatmakanan.prepareNonVegMeal();
      System.out.println("\n\nNon-Veg Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " + nonVegMeal.getCost());
      
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
        
        
         System.out.println("\n\nComposite Pattern ");
         Karyawan BOS = new Karyawan("Dimas","Bos",100000000);
        
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
}