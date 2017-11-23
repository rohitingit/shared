package com.shared.common.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest implements Serializable {

	private static final long serialVersionUID = -4095890266848846871L;

	private Long userId;
	
	private String username;
	
	private String loginWith;
	
	private String password;
	
	private String socialId;
	
	private String email;;
	
	private String deviceId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String mobileNo;

	private String dob;

	private Long roleId;

	private String gender;

	private String profileImageUrl;

	private Boolean isEmailVerified;

	private Boolean isMobileVerified;

	private String signupStage;

	private String status;

	private Long tzOffset;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getLoginWith() {
		return loginWith;
	}

	public void setLoginWith(String loginWith) {
		this.loginWith = loginWith;
	}

	public String getSocialId() {
		return socialId;
	}

	public void setSocialId(String socialId) {
		this.socialId = socialId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public Boolean getIsEmailVerified() {
		return isEmailVerified;
	}

	public void setIsEmailVerified(Boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}

	public Boolean getIsMobileVerified() {
		return isMobileVerified;
	}

	public void setIsMobileVerified(Boolean isMobileVerified) {
		this.isMobileVerified = isMobileVerified;
	}

	public String getSignupStage() {
		return signupStage;
	}

	public void setSignupStage(String signupStage) {
		this.signupStage = signupStage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTzOffset() {
		return tzOffset;
	}

	public void setTzOffset(Long tzOffset) {
		this.tzOffset = tzOffset;
	}

	@Override
	public String toString() {
		return "UserRequest [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", email=" + email + ", mobileNo=" + mobileNo + ", password=" + password
				+ ", dob=" + dob + ", roleId=" + roleId + ", gender=" + gender + ", profileImageUrl=" + profileImageUrl
				+ ", isEmailVerified=" + isEmailVerified + ", isMobileVerified=" + isMobileVerified + ", signupStage="
				+ signupStage + ", status=" + status + ", tzOffset=" + tzOffset + "]";
	}
}
