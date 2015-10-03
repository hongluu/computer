package com.hust.kiwi.repository.entites;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the feature database table.
 * 
 */
@Entity
@NamedQuery(name="Feature.findAll", query="SELECT f FROM Feature f")
public class Feature implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="feature_id")
	private int featureId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_create")
	private Date dateCreate;

	@Column(name="date_update")
	private Timestamp dateUpdate;

	@Column(name="feature_alias")
	private String featureAlias;

	@Column(name="feature_title")
	private String featureTitle;

	@Column(name="is_delete")
	private byte isDelete;

	@Column(name="is_published")
	private byte isPublished;

	@Column(name="is_value")
	private byte isValue;

	private int ordering;

	@Column(name="parent_id")
	private int parentId;

	//bi-directional many-to-one association to CategoriesFeature
	@OneToMany(mappedBy="feature")
	private List<CategoriesFeature> categoriesFeatures;

	//bi-directional many-to-one association to ProductsFeature
	@OneToMany(mappedBy="feature")
	private List<ProductsFeature> productsFeatures;

	public Feature() {
	}

	public int getFeatureId() {
		return this.featureId;
	}

	public void setFeatureId(int featureId) {
		this.featureId = featureId;
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

	public String getFeatureAlias() {
		return this.featureAlias;
	}

	public void setFeatureAlias(String featureAlias) {
		this.featureAlias = featureAlias;
	}

	public String getFeatureTitle() {
		return this.featureTitle;
	}

	public void setFeatureTitle(String featureTitle) {
		this.featureTitle = featureTitle;
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

	public byte getIsValue() {
		return this.isValue;
	}

	public void setIsValue(byte isValue) {
		this.isValue = isValue;
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

	public List<CategoriesFeature> getCategoriesFeatures() {
		return this.categoriesFeatures;
	}

	public void setCategoriesFeatures(List<CategoriesFeature> categoriesFeatures) {
		this.categoriesFeatures = categoriesFeatures;
	}

	public CategoriesFeature addCategoriesFeature(CategoriesFeature categoriesFeature) {
		getCategoriesFeatures().add(categoriesFeature);
		categoriesFeature.setFeature(this);

		return categoriesFeature;
	}

	public CategoriesFeature removeCategoriesFeature(CategoriesFeature categoriesFeature) {
		getCategoriesFeatures().remove(categoriesFeature);
		categoriesFeature.setFeature(null);

		return categoriesFeature;
	}

	public List<ProductsFeature> getProductsFeatures() {
		return this.productsFeatures;
	}

	public void setProductsFeatures(List<ProductsFeature> productsFeatures) {
		this.productsFeatures = productsFeatures;
	}

	public ProductsFeature addProductsFeature(ProductsFeature productsFeature) {
		getProductsFeatures().add(productsFeature);
		productsFeature.setFeature(this);

		return productsFeature;
	}

	public ProductsFeature removeProductsFeature(ProductsFeature productsFeature) {
		getProductsFeatures().remove(productsFeature);
		productsFeature.setFeature(null);

		return productsFeature;
	}

}