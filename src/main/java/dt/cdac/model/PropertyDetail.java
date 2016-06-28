package dt.cdac.model;

import java.io.Serializable;

import javax.persistence.*;



/**
 * The persistent class for the property_details database table.
 * 
 */

@NamedQuery(name="PropertyDetail.byID", query="SELECT from PropertyDetail where id = ?")
@Entity
@Table(name="property_details")
public class PropertyDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;


	@Column(name="accomodation_size")
	private int accomodationSize;

	private int amount;

	@Column(name="category_id")
	private String categoryId;

	@Column(name="contact_email")
	private String contactEmail;

	@Column(name="contact_name")
	private String contactName;

	@Column(name="contact_no")
	private String contactNo;

	@Column(name="image_folder")
	private String imageFolder;

	private String location;

	@Column(name="max_booking_days")
	private int maxBookingDays;

	@Column(name="property_area")
	private String propertyArea;

	@Column(name="property_desc")
	private String propertyDesc;

	@Column(name="property_id")
	private String propertyId;

	@Column(name="property_name")
	private String propertyName;

	@Column(name="security_charges")
	private int securityCharges;

	private int tax1;

	private int tax2;

	public PropertyDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccomodationSize() {
		return this.accomodationSize;
	}

	public void setAccomodationSize(int accomodationSize) {
		this.accomodationSize = accomodationSize;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getImageFolder() {
		return this.imageFolder;
	}

	public void setImageFolder(String imageFolder) {
		this.imageFolder = imageFolder;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMaxBookingDays() {
		return this.maxBookingDays;
	}

	public void setMaxBookingDays(int maxBookingDays) {
		this.maxBookingDays = maxBookingDays;
	}

	public String getPropertyArea() {
		return this.propertyArea;
	}

	public void setPropertyArea(String propertyArea) {
		this.propertyArea = propertyArea;
	}

	public String getPropertyDesc() {
		return this.propertyDesc;
	}

	public void setPropertyDesc(String propertyDesc) {
		this.propertyDesc = propertyDesc;
	}

	public String getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public int getSecurityCharges() {
		return this.securityCharges;
	}

	public void setSecurityCharges(int securityCharges) {
		this.securityCharges = securityCharges;
	}

	public int getTax1() {
		return this.tax1;
	}

	public void setTax1(int tax1) {
		this.tax1 = tax1;
	}

	public int getTax2() {
		return this.tax2;
	}

	public void setTax2(int tax2) {
		this.tax2 = tax2;
	}

	@Override
	public String toString() {
		return "PropertyDetail [id=" + id + ", accomodationSize="
				+ accomodationSize + ", amount=" + amount + ", categoryId="
				+ categoryId + ", contactEmail=" + contactEmail
				+ ", contactName=" + contactName + ", contactNo=" + contactNo
				+ ", imageFolder=" + imageFolder + ", location=" + location
				+ ", maxBookingDays=" + maxBookingDays + ", propertyArea="
				+ propertyArea + ", propertyDesc=" + propertyDesc
				+ ", propertyId=" + propertyId + ", propertyName="
				+ propertyName + ", securityCharges=" + securityCharges
				+ ", tax1=" + tax1 + ", tax2=" + tax2 + "]";
	}
	
	

}