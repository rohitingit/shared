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
public class CertificationRequest implements Serializable {

	private static final long serialVersionUID = -4095890266848846871L;

	private Long id;

	private Long userId;

	private String name;

	private String title;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		return "CertificationRequest [userId=" + userId + ", name=" + name + ", title=" + title + ", isActive="
				+ isActive + ", attachmentUrl=" + attachmentUrl + "]";
	}
}
