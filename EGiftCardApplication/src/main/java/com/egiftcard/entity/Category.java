//package com.egiftcard.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "category")
//public class Category {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="category_id")
//	private int categoryId;
//	@Column(name="category_name")
//	private String name;
//	@Column(name="category_description")
//	private String categoryDescription;
//	
//	public int getCategoryId() {
//		return categoryId;
//	}
//	public void setCategoryId(int categoryId) {
//		this.categoryId = categoryId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getCategoryDescription() {
//		return categoryDescription;
//	}
//	public void setCategoryDescription(String categoryDescription) {
//		this.categoryDescription = categoryDescription;
//	}
//	
//	public Category(int categoryId, String name, String categoryDescription) {
//		super();
//		this.categoryId = categoryId;
//		this.name = name;
//		this.categoryDescription = categoryDescription;
//	}
//	
//	public Category() {
//		super();
//	}
//	
//
//}
