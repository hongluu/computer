package com.hust.kiwi.repository.entites;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categories_feature database table.
 * 
 */
@Entity
@Table(name="categories_feature")
@NamedQuery(name="CategoriesFeature.findAll", query="SELECT c FROM CategoriesFeature c")
public class CategoriesFeature implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_published")
	private byte isPublished;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categories_id")
	private Category category;

	//bi-directional many-to-one association to Feature
	@ManyToOne
	@JoinColumn(name="feature_id")
	private Feature feature;

	public CategoriesFeature() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(byte isPublished) {
		this.isPublished = isPublished;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Feature getFeature() {
		return this.feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

}