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
	
	private Integer size;

	/**
	 * @return the pageNumber
	 */
	public Integer getPageNumber() {
		return pageNumber;
	}

	/**
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PageRequest [pageNumber=" + pageNumber + ", size=" + size + "]";
	}
}
