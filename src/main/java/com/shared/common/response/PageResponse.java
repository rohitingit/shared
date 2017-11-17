package com.shared.common.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class PageResponse<T> extends BaseResponse implements Page<T> {

	private static final long serialVersionUID = 6560255935180791282L;
	private int number;
	private int size;
	private int numberOfElements;
	private long totalElements;
	private int totalPages;
    private List<T> elements;

	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the totalElements
	 */
	public long getTotalElements() {
		return totalElements;
	}
	/**
	 * @param totalElements the totalElements to set
	 */
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}
	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}


	/**
	 * @return the numberOfElements
	 */
	public int getNumberOfElements() {
		return numberOfElements;
	}


	/**
	 * @param numberOfElements the numberOfElements to set
	 */
	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	/**
	 * @return the elements
	 */
	public List<T> getElements() {
		return elements;
	}

	/**
	 * @param elements the elements to set
	 */
	public void setElements(List<T> elements) {
		this.elements = elements;
	}
	
}

