/**
 * 
 */
package com.shared.common.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Rohit
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QualificationRequest implements Serializable {

	private static final long serialVersionUID = -4095890266848846871L;

	private Long id;

	private Long userId;

	private String specialization;

	private String institute;

	private String instituteName;

	private Integer obtainMarks;

	private Integer totalMarks;

	private Double percentage;

	private String admissionDate;

	private String complitionDate;

	private Boolean isActive;

	private String attachmentUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public Integer getObtainMarks() {
		return obtainMarks;
	}

	public void setObtainMarks(Integer obtainMarks) {
		this.obtainMarks = obtainMarks;
	}

	public Integer getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getComplitionDate() {
		return complitionDate;
	}

	public void setComplitionDate(String complitionDate) {
		this.complitionDate = complitionDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getAttachmentUrl() {
		return attachmentUrl;
	}

	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

	@Override
	public String toString() {
		return "QualificationRequest [id=" + id + ", userId=" + userId + ", specialization=" + specialization
				+ ", institute=" + institute + ", instituteName=" + instituteName + ", obtainMarks=" + obtainMarks
				+ ", totalMarks=" + totalMarks + ", percentage=" + percentage + ", admissionDate=" + admissionDate
				+ ", complitionDate=" + complitionDate + ", isActive=" + isActive + ", attachmentUrl=" + attachmentUrl
				+ "]";
	}
}
