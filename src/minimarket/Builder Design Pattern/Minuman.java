/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;
public abstract class Minuman implements Item {

	public Packing packing() {
       return new Botol();
	}

	public abstract float harga();
}