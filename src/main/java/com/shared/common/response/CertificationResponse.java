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
public class CertificationResponse extends BaseResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long userId;

	private String name;

	private String title;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
		return "CertificationResponse [id=" + id + ", userId=" + userId + ", name=" + name + ", title=" + title
				+ ", isActive=" + isActive + ", attachmentUrl=" + attachmentUrl + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + "]";
	}

}
