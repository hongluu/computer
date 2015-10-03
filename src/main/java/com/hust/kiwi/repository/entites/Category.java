package com.hust.kiwi.repository.entites;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the categories database table.
 * 
 */
@Entity
@Table(name="categories")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="categories_id")
	private int categoriesId;

	@Column(name="categories_alias")
	private String categoriesAlias;

	@Column(name="categories_title")
	private String categoriesTitle;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_create")
	private Date dateCreate;

	@Column(name="date_update")
	private Timestamp dateUpdate;

	@Column(name="is_delete")
	private byte isDelete;

	@Column(name="is_published")
	private byte isPublished;

	private int ordering;

	@Column(name="parent_id")
	private int parentId;

	@Lob
	@Column(name="seo_description")
	private String seoDescription;

	@Column(name="seo_keywords")
	private String seoKeywords;

	@Column(name="seo_title")
	private String seoTitle;

	//bi-directional many-to-one association to CategoriesFeature
	@OneToMany(mappedBy="category")
	private List<CategoriesFeature> categoriesFeatures;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="category")
	private List<Product> products;

	public Category() {
	}

	public int getCategoriesId() {
		return this.categoriesId;
	}

	public void setCategoriesId(int categoriesId) {
		this.categoriesId = categoriesId;
	}

	public String getCategoriesAlias() {
		return this.categoriesAlias;
	}

	public void setCategoriesAlias(String categoriesAlias) {
		this.categoriesAlias = categoriesAlias;
	}

	public String getCategoriesTitle() {
		return this.categoriesTitle;
	}

	public void setCategoriesTitle(String categoriesTitle) {
		this.categoriesTitle = categoriesTitle;
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

	public int getOrdering() {
		return this.ordering;
	}

	public void setOrdering(int ordering) {
		this.ordering = ordering;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
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

	public List<CategoriesFeature> getCategoriesFeatures() {
		return this.categoriesFeatures;
	}

	public void setCategoriesFeatures(List<CategoriesFeature> categoriesFeatures) {
		this.categoriesFeatures = categoriesFeatures;
	}

	public CategoriesFeature addCategoriesFeature(CategoriesFeature categoriesFeature) {
		getCategoriesFeatures().add(categoriesFeature);
		categoriesFeature.setCategory(this);

		return categoriesFeature;
	}

	public CategoriesFeature removeCategoriesFeature(CategoriesFeature categoriesFeature) {
		getCategoriesFeatures().remove(categoriesFeature);
		categoriesFeature.setCategory(null);

		return categoriesFeature;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setCategory(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setCategory(null);

		return product;
	}

}