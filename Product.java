package com.example.demo.model;



	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	//O-R-M Object-Relation-Mapping
	//Mapping or Linking  M
	@Table(name = "product") // Relation or Relational Table R
	@Entity // informs or signals that this is Entity Java Bean Class
	public class Product {// Object O

		@Id
		private int id;
		private String uname;
		private int price;
		private int quantity;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

	}




