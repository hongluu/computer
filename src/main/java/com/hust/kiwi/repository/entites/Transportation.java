package com.hust.kiwi.repository.entites;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the transportation database table.
 * 
 */
@Entity
@NamedQuery(name="Transportation.findAll", query="SELECT t FROM Transportation t")
public class Transportation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="transportation_id")
	private int transportationId;

	@Column(name="is_delete")
	private byte isDelete;

	@Column(name="is_published")
	private byte isPublished;

	private int price;

	@Lob
	@Column(name="transportation_description")
	private String transportationDescription;

	@Column(name="transportation_title")
	private String transportationTitle;

	//bi-directional many-to-one association to Invoice
	@OneToMany(mappedBy="transportation")
	private List<Invoice> invoices;

	public Transportation() {
	}

	public int getTransportationId() {
		return this.transportationId;
	}

	public void setTransportationId(int transportationId) {
		this.transportationId = transportationId;
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

	public String getTransportationDescription() {
		return this.transportationDescription;
	}

	public void setTransportationDescription(String transportationDescription) {
		this.transportationDescription = transportationDescription;
	}

	public String getTransportationTitle() {
		return this.transportationTitle;
	}

	public void setTransportationTitle(String transportationTitle) {
		this.transportationTitle = transportationTitle;
	}

	public List<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public Invoice addInvoice(Invoice invoice) {
		getInvoices().add(invoice);
		invoice.setTransportation(this);

		return invoice;
	}

	public Invoice removeInvoice(Invoice invoice) {
		getInvoices().remove(invoice);
		invoice.setTransportation(null);

		return invoice;
	}

}