/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;
public abstract class Kebab implements Item {

   public Packing packing() {
      return new Pembungkus ();
   }

   public abstract float harga();
}
