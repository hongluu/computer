package com.hust.kiwi.repository.entites;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="products_id")
	private int productsId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_create")
	private Date dateCreate;

	@Column(name="date_update")
	private Timestamp dateUpdate;

	@Column(name="is_available")
	private byte isAvailable;

	@Column(name="is_delete")
	private byte isDelete;

	@Column(name="is_hot")
	private byte isHot;

	@Column(name="is_new")
	private byte isNew;

	@Column(name="is_published")
	private byte isPublished;

	@Column(name="number_like")
	private int numberLike;

	@Column(name="number_views")
	private int numberViews;

	private int ordering;

	private int price;

	@Column(name="price_sale")
	private int priceSale;

	@Column(name="products_alias")
	private String productsAlias;

	@Column(name="products_code")
	private String productsCode;

	@Lob
	@Column(name="products_description")
	private String productsDescription;

	@Column(name="products_title")
	private String productsTitle;

	private int quantity;

	private float rating;

	@Lob
	@Column(name="seo_description")
	private String seoDescription;

	@Column(name="seo_keywords")
	private String seoKeywords;

	@Column(name="seo_title")
	private String seoTitle;

	@Column(name="thumb_image")
	private String thumbImage;

	@Column(name="total_sale")
	private int totalSale;

	@Column(name="users_fullname")
	private String usersFullname;

	private int vat;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categories_id")
	private Category category;

	//bi-directional many-to-one association to Manufacturer
	@ManyToOne
	@JoinColumn(name="manufacturers_id")
	private Manufacturer manufacturer;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="users_id")
	private User user;

	//bi-directional many-to-one association to ProductsFeature
	@OneToMany(mappedBy="product")
	private List<ProductsFeature> productsFeatures;

	//bi-directional many-to-one association to ProductsImage
	@OneToMany(mappedBy="product")
	private List<ProductsImage> productsImages;

	//bi-directional many-to-one association to ProductsInvoice
	@OneToMany(mappedBy="product")
	private List<ProductsInvoice> productsInvoices;

	public Product() {
	}

	public int getProductsId() {
		return this.productsId;
	}

	public void setProductsId(int productsId) {
		this.productsId = productsId;
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

	public byte getIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(byte isAvailable) {
		this.isAvailable = isAvailable;
	}

	public byte getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(byte isDelete) {
		this.isDelete = isDelete;
	}

	public byte getIsHot() {
		return this.isHot;
	}

	public void setIsHot(byte isHot) {
		this.isHot = isHot;
	}

	public byte getIsNew() {
		return this.isNew;
	}

	public void setIsNew(byte isNew) {
		this.isNew = isNew;
	}

	public byte getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(byte isPublished) {
		this.isPublished = isPublished;
	}

	public int getNumberLike() {
		return this.numberLike;
	}

	public void setNumberLike(int numberLike) {
		this.numberLike = numberLike;
	}

	public int getNumberViews() {
		return this.numberViews;
	}

	public void setNumberViews(int numberViews) {
		this.numberViews = numberViews;
	}

	public int getOrdering() {
		return this.ordering;
	}

	public void setOrdering(int ordering) {
		this.ordering = ordering;
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

	public String getProductsAlias() {
		return this.productsAlias;
	}

	public void setProductsAlias(String productsAlias) {
		this.productsAlias = productsAlias;
	}

	public String getProductsCode() {
		return this.productsCode;
	}

	public void setProductsCode(String productsCode) {
		this.productsCode = productsCode;
	}

	public String getProductsDescription() {
		return this.productsDescription;
	}

	public void setProductsDescription(String productsDescription) {
		this.productsDescription = productsDescription;
	}

	public String getProductsTitle() {
		return this.productsTitle;
	}

	public void setProductsTitle(String productsTitle) {
		this.productsTitle = productsTitle;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getRating() {
		return this.rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getSeoDescription() {
		return this.seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}

	public String getSeoKeywords() {
		return this.seoKeywords;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}

	public String getSeoTitle() {
		return this.seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getThumbImage() {
		return this.thumbImage;
	}

	public void setThumbImage(String thumbImage) {
		this.thumbImage = thumbImage;
	}

	public int getTotalSale() {
		return this.totalSale;
	}

	public void setTotalSale(int totalSale) {
		this.totalSale = totalSale;
	}

	public String getUsersFullname() {
		return this.usersFullname;
	}

	public void setUsersFullname(String usersFullname) {
		this.usersFullname = usersFullname;
	}

	public int getVat() {
		return this.vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Manufacturer getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ProductsFeature> getProductsFeatures() {
		return this.productsFeatures;
	}

	public void setProductsFeatures(List<ProductsFeature> productsFeatures) {
		this.productsFeatures = productsFeatures;
	}

	public ProductsFeature addProductsFeature(ProductsFeature productsFeature) {
		getProductsFeatures().add(productsFeature);
		productsFeature.setProduct(this);

		return productsFeature;
	}

	public ProductsFeature removeProductsFeature(ProductsFeature productsFeature) {
		getProductsFeatures().remove(productsFeature);
		productsFeature.setProduct(null);

		return productsFeature;
	}

	public List<ProductsImage> getProductsImages() {
		return this.productsImages;
	}

	public void setProductsImages(List<ProductsImage> productsImages) {
		this.productsImages = productsImages;
	}

	public ProductsImage addProductsImage(ProductsImage productsImage) {
		getProductsImages().add(productsImage);
		productsImage.setProduct(this);

		return productsImage;
	}

	public ProductsImage removeProductsImage(ProductsImage productsImage) {
		getProductsImages().remove(productsImage);
		productsImage.setProduct(null);

		return productsImage;
	}

	public List<ProductsInvoice> getProductsInvoices() {
		return this.productsInvoices;
	}

	public void setProductsInvoices(List<ProductsInvoice> productsInvoices) {
		this.productsInvoices = productsInvoices;
	}

	public ProductsInvoice addProductsInvoice(ProductsInvoice productsInvoice) {
		getProductsInvoices().add(productsInvoice);
		productsInvoice.setProduct(this);

		return productsInvoice;
	}

	public ProductsInvoice removeProductsInvoice(ProductsInvoice productsInvoice) {
		getProductsInvoices().remove(productsInvoice);
		productsInvoice.setProduct(null);

		return productsInvoice;
	}

}