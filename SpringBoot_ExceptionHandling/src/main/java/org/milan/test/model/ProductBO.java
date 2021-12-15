/**
 * 
 */
package org.milan.test.model;

/**
 * @author Milan
 *
 */
public class ProductBO {

	private int id;
	private String name;
	private double price;

	public ProductBO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductBO(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductBO [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
