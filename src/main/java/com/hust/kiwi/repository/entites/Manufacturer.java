package com.hust.kiwi.repository.entites;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the manufacturers database table.
 * 
 */
@Entity
@Table(name="manufacturers")
@NamedQuery(name="Manufacturer.findAll", query="SELECT m FROM Manufacturer m")
public class Manufacturer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="manufacturers_id")
	private int manufacturersId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_create")
	private Date dateCreate;

	@Column(name="date_update")
	private Timestamp dateUpdate;

	@Column(name="is_delete")
	private int isDelete;

	@Column(name="is_published")
	private int isPublished;

	@Column(name="manufacturers_name")
	private String manufacturersName;

	private int ordering;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="manufacturer")
	private List<Product> products;

	public Manufacturer() {
	}

	public int getManufacturersId() {
		return this.manufacturersId;
	}

	public void setManufacturersId(int manufacturersId) {
		this.manufacturersId = manufacturersId;
	}

	public Date getDateCreate() {
		return this.dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Timestamp getDateUpdate() {
		return this.dateUpdate;
	}

	public void setDateUpdate(Timestamp dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public int getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}

	public int getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(int isPublished) {
		this.isPublished = isPublished;
	}

	public String getManufacturersName() {
		return this.manufacturersName;
	}

	public void setManufacturersName(String manufacturersName) {
		this.manufacturersName = manufacturersName;
	}

	public int getOrdering() {
		return this.ordering;
	}

	public void setOrdering(int ordering) {
		this.ordering = ordering;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setManufacturer(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setManufacturer(null);

		return product;
	}

}