package com.hust.kiwi.repository.entites;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the invoice database table.
 * 
 */
@Entity
@NamedQuery(name="Invoice.findAll", query="SELECT i FROM Invoice i")
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="invoice_id")
	private int invoiceId;

	@Lob
	private String address;

	@Lob
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_create")
	private Date dateCreate;

	@Column(name="date_update")
	private Timestamp dateUpdate;

	private String delivery;

	private String email;

	@Column(name="email_subscription")
	private String emailSubscription;

	@Column(name="full_name")
	private String fullName;

	@Lob
	@Column(name="invoice_description")
	private String invoiceDescription;

	@Column(name="invoice_title")
	private String invoiceTitle;

	@Column(name="is_delete")
	private byte isDelete;

	@Column(name="is_published")
	private byte isPublished;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pay_date")
	private Date payDate;

	private String payment;

	@Column(name="payment_id")
	private int paymentId;

	private String phone;

	private int total;

	private String transactionid;

	//bi-directional many-to-one association to Transportation
	@ManyToOne
	@JoinColumn(name="transportation_id")
	private Transportation transportation;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="users_id")
	private User user;

	//bi-directional many-to-one association to ProductsInvoice
	@OneToMany(mappedBy="invoice")
	private List<ProductsInvoice> productsInvoices;

	public Invoice() {
	}

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public String getDelivery() {
		return this.delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailSubscription() {
		return this.emailSubscription;
	}

	public void setEmailSubscription(String emailSubscription) {
		this.emailSubscription = emailSubscription;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getInvoiceDescription() {
		return this.invoiceDescription;
	}

	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
	}

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
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

	public Date getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public int getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	public Transportation getTransportation() {
		return this.transportation;
	}

	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ProductsInvoice> getProductsInvoices() {
		return this.productsInvoices;
	}

	public void setProductsInvoices(List<ProductsInvoice> productsInvoices) {
		this.productsInvoices = productsInvoices;
	}

	public ProductsInvoice addProductsInvoice(ProductsInvoice productsInvoice) {
		getProductsInvoices().add(productsInvoice);
		productsInvoice.setInvoice(this);

		return productsInvoice;
	}

	public ProductsInvoice removeProductsInvoice(ProductsInvoice productsInvoice) {
		getProductsInvoices().remove(productsInvoice);
		productsInvoice.setInvoice(null);

		return productsInvoice;
	}

}