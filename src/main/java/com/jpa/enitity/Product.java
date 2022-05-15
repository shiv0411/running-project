package com.jpa.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
   
	@Id
	private int pid;
	private String Pname ;
	private int qty;
	private int price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, int qty, int price) {
		super();
		this.pid = pid;
		Pname = pname;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", Pname=" + Pname + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
}
