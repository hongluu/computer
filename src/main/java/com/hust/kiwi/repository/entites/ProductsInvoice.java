package com.hust.kiwi.repository.entites;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the products_invoice database table.
 * 
 */
@Entity
@Table(name="products_invoice")
@NamedQuery(name="ProductsInvoice.findAll", query="SELECT p FROM ProductsInvoice p")
public class ProductsInvoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_delete")
	private byte isDelete;

	@Column(name="is_published")
	private byte isPublished;

	private int price;

	@Column(name="price_sale")
	private int priceSale;

	private int quantity;

	private int total;

	//bi-directional many-to-one association to Invoice
	@ManyToOne
	@JoinColumn(name="invoice_id")
	private Invoice invoice;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="products_id")
	private Product product;

	public ProductsInvoice() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(byte isDelete) {
		this.isDelete = isDelete;
	}

	public byte getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(byte isPublished) {
		this.isPublished = isPublished;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPriceSale() {
		return this.priceSale;
	}

	public void setPriceSale(int priceSale) {
		this.priceSale = priceSale;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Invoice getInvoice() {
		return this.invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}