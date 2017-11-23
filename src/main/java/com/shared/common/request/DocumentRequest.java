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
public class DocumentRequest implements Serializable {

	private static final long serialVersionUID = -4095890266848846871L;

	private Long id;

	private Long userId;

	private Long typeId;

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

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
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
		return "DocumentRequest [id=" + id + ", userId=" + userId + ", typeId=" + typeId + ", isActive=" + isActive
				+ ", attachmentUrl=" + attachmentUrl + "]";
	}

}
