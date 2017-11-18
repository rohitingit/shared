/**
 * 
 */
package com.shared.common.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author simran
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageRequest implements Serializable {
	
	private static final long serialVersionUID = -4095890266848846871L;
	
	private Integer pageNumber;
	
	private Integer pageSize;

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "PageRequest [pageNumber=" + pageNumber + ", pageSize=" + pageSize + "]";
	}
	
}
