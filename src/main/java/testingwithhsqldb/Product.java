/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingwithhsqldb;

/**
 *
 * @author pedago
 */
public class Product {
    private int id = -1;
    private String name = "Unknown";
    private float price = 0.0f;

	public Product(int i, String n, float p) {
		this.id = i;
		this.name = n;
		this.price = p;
	}
    
}
