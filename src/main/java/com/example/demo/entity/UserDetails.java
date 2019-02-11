package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetails implements Serializable{

	/**
	 * @author Manish Kumar	 * 
	 */
	private static final long serialVersionUID = -8072023768822773717L;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	
	@Column(name="user_id", nullable=false, length=20)
	private String userId;
	
	@Column(name="user_first_name", nullable=false, length=30)
	private String firstName;
	
	@Column(name="user_middle_name", nullable=true, length=30)
	private String middleName;
	
	@Column(name="user_last_name", nullable=false, length=30)
	private String lastName;
	
	@Column(name="user_designation", nullable=true, length=30)
	private String designation;
	
	@Column(name="date_of_birth", nullable=true)
	private Date dateOfBirth;
	
	@Column(name="gender", nullable=false, length=20)
	private String gender;
	
	@Column(name="email", nullable=false, length=50)
	private String email;
	
	@Column(name="phone", nullable=true, length=20)
	private String phone;
	
	@Column(name="mobile", nullable=true, length=20)
	private String mobile;
	
	@Column(name="company_name", nullable=true)
	private String company;
	
	@Column(name="country", nullable=false)
	private String country;
	
	@Column(name="city", nullable=true)
	private String city;
	
	@Column(name="pin_code", nullable=true)
	private String pinCode;
	
	@Column(name="is_active", nullable=false, length=5)
	private String isActive;
	
	@Column(name="user_access_codes", nullable=false, length=50)
	private String accessCodes;
	
	@Column(name="last_access_date", nullable=true)
	private Date lastAccessDate;
	
	@Column(name="username", nullable=false, length=30)
	private String username;
	
	@Column(name="password", nullable=false, length=30)
	private String password;
	
	@Column(name="profile_pic", nullable=true)
	private Byte profilePic;
	
	@Column(name="about_me", nullable=true, length=10000)
	private String aboutMe;
	
	@Column(name="created_date", nullable=true)
	private Date createdDate;
	
	@Column(name="updated_date", nullable=true)
	private Date updatedDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getAccessCodes() {
		return accessCodes;
	}
	public void setAccessCodes(String accessCodes) {
		this.accessCodes = accessCodes;
	}
	public Date getLastAccessDate() {
		return lastAccessDate;
	}
	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Byte getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(Byte profilePic) {
		this.profilePic = profilePic;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", designation=" + designation + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", mobile=" + mobile
				+ ", company=" + company + ", country=" + country + ", city=" + city + ", pinCode=" + pinCode
				+ ", isActive=" + isActive + ", accessCodes=" + accessCodes + ", lastAccessDate=" + lastAccessDate
				+ ", username=" + username + ", password=" + password + ", profilePic=" + profilePic + ", aboutMe="
				+ aboutMe + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
}
