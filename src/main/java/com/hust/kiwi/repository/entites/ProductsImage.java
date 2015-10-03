package com.hust.kiwi.repository.entites;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the products_images database table.
 * 
 */
@Entity
@Table(name="products_images")
@NamedQuery(name="ProductsImage.findAll", query="SELECT p FROM ProductsImage p")
public class ProductsImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="date_create")
	private Timestamp dateCreate;

	private String images;

	@Column(name="is_published")
	private byte isPublished;

	private int ordering;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="products_id")
	private Product product;

	public ProductsImage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDateCreate() {
		return this.dateCreate;
	}

	public void setDateCreate(Timestamp dateCreate) {
		this.dateCreate = dateCreate;
	}

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public byte getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(byte isPublished) {
		this.isPublished = isPublished;
	}

	public int getOrdering() {
		return this.ordering;
	}

	public void setOrdering(int ordering) {
		this.ordering = ordering;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}