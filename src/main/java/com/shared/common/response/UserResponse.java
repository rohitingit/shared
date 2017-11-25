package com.shared.common.response;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class UserResponse extends BaseResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long userId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String email;

	private String mobileNo;

	private String password;

	private LocalDate dob;

	private Long roleId;

	private String gender;

	private String profileImageUrl;

	private Boolean isEmailVerified;

	private Boolean isMobileVerified;

	private String signupStage;

	private String profileStatus;

	private Long tzOffset;

	private Date createdDate;

	private Date modifiedDate;

	private List<CertificationResponse> certifications;

	private List<DocumentResponse> documents;

	private List<QualificationResponse> qualifications;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
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

	public String getProfileStatus() {
		return profileStatus;
	}

	public void setProfileStatus(String profileStatus) {
		this.profileStatus = profileStatus;
	}

	public Long getTzOffset() {
		return tzOffset;
	}

	public void setTzOffset(Long tzOffset) {
		this.tzOffset = tzOffset;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the certifications
	 */
	public List<CertificationResponse> getCertifications() {
		return certifications;
	}

	/**
	 * @param certifications
	 *            the certifications to set
	 */
	public void setCertifications(List<CertificationResponse> certifications) {
		this.certifications = certifications;
	}

	/**
	 * @return the documents
	 */
	public List<DocumentResponse> getDocuments() {
		return documents;
	}

	/**
	 * @param documents
	 *            the documents to set
	 */
	public void setDocuments(List<DocumentResponse> documents) {
		this.documents = documents;
	}

	/**
	 * @return the qualifications
	 */
	public List<QualificationResponse> getQualifications() {
		return qualifications;
	}

	/**
	 * @param qualifications
	 *            the qualifications to set
	 */
	public void setQualifications(List<QualificationResponse> qualifications) {
		this.qualifications = qualifications;
	}

	@Override
	public String toString() {
		return "UserResponse [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", email=" + email + ", mobileNo=" + mobileNo + ", password=" + password
				+ ", dob=" + dob + ", roleId=" + roleId + ", gender=" + gender + ", profileImageUrl=" + profileImageUrl
				+ ", isEmailVerified=" + isEmailVerified + ", isMobileVerified=" + isMobileVerified + ", signupStage="
				+ signupStage + ", profileStatus=" + profileStatus + ", tzOffset=" + tzOffset + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + "]";
	}

}
