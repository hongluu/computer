package com.hust.kiwi.repository.entites;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the products_feature database table.
 * 
 */
@Entity
@Table(name="products_feature")
@NamedQuery(name="ProductsFeature.findAll", query="SELECT p FROM ProductsFeature p")
public class ProductsFeature implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_published")
	private byte isPublished;

	private String value;

	//bi-directional many-to-one association to Feature
	@ManyToOne
	@JoinColumn(name="feature_id")
	private Feature feature;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="products_id")
	private Product product;

	public ProductsFeature() {
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

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Feature getFeature() {
		return this.feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}