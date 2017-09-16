package com.ePages.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class FoodItem extends BaseEntity {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@ManyToMany
	@JoinTable(name = "item_ingredients", joinColumns = { @JoinColumn(name = "item_id") }, inverseJoinColumns = {
			@JoinColumn(name = "ingredients_id") })
	private Set<Ingredients> ingredients;
	
	@ManyToOne
	@JoinColumn(name="catagory")
	private ItemCatagory catagory;

	public ItemCatagory getCatagory() {
		return catagory;
	}

	public void setCatagory(ItemCatagory catagory) {
		this.catagory = catagory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Ingredients> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}
}
