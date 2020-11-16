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
    }
    
}
