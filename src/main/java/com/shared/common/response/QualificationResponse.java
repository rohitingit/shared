/**
 * 
 */
package com.shared.common.response;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Rohit
 *
 */
public class QualificationResponse extends BaseResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long userId;

	private String specialization;

	private String institute;

	private String instituteName;

	private Integer obtainMarks;

	private Integer totalMarks;

	private Double percentage;

	private Date admissionDate;

	private Date complitionDate;

	private Boolean isActive;

	private String attachmentUrl;

	private Date createdDate;

	private Date modifiedDate;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * @param specialization
	 *            the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	/**
	 * @return the institute
	 */
	public String getInstitute() {
		return institute;
	}

	/**
	 * @param institute
	 *            the institute to set
	 */
	public void setInstitute(String institute) {
		this.institute = institute;
	}

	/**
	 * @return the instituteName
	 */
	public String getInstituteName() {
		return instituteName;
	}

	/**
	 * @param instituteName
	 *            the instituteName to set
	 */
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	/**
	 * @return the obtainMarks
	 */
	public Integer getObtainMarks() {
		return obtainMarks;
	}

	/**
	 * @param obtainMarks
	 *            the obtainMarks to set
	 */
	public void setObtainMarks(Integer obtainMarks) {
		this.obtainMarks = obtainMarks;
	}

	/**
	 * @return the totalMarks
	 */
	public Integer getTotalMarks() {
		return totalMarks;
	}

	/**
	 * @param totalMarks
	 *            the totalMarks to set
	 */
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	/**
	 * @return the percentage
	 */
	public Double getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage
	 *            the percentage to set
	 */
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	/**
	 * @return the admissionDate
	 */
	public Date getAdmissionDate() {
		return admissionDate;
	}

	/**
	 * @param admissionDate
	 *            the admissionDate to set
	 */
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	/**
	 * @return the complitionDate
	 */
	public Date getComplitionDate() {
		return complitionDate;
	}

	/**
	 * @param complitionDate
	 *            the complitionDate to set
	 */
	public void setComplitionDate(Date complitionDate) {
		this.complitionDate = complitionDate;
	}

	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the attachmentUrl
	 */
	public String getAttachmentUrl() {
		return attachmentUrl;
	}

	/**
	 * @param attachmentUrl
	 *            the attachmentUrl to set
	 */
	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QualificationResponse [id=" + id + ", userId=" + userId + ", specialization=" + specialization
				+ ", institute=" + institute + ", instituteName=" + instituteName + ", obtainMarks=" + obtainMarks
				+ ", totalMarks=" + totalMarks + ", percentage=" + percentage + ", admissionDate=" + admissionDate
				+ ", complitionDate=" + complitionDate + ", isActive=" + isActive + ", attachmentUrl=" + attachmentUrl
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + "]";
	}

}
