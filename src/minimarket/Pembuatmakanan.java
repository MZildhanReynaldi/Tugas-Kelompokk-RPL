/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

public class Pembuatmakanan {

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new Burger());
      meal.addItem(new Jusbuah());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new Pizza());
      meal.addItem(new Pepsi());
      return meal;
   }
}