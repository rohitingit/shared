package com.shared.common.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Rohit
 *
 * @param <T>
 */
@JsonInclude(Include.NON_NULL)
public class ListResponse<T> extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private List<T> list;

	/**
	 * @return the list
	 */
	public List<T> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<T> list) {
		this.list = list;
	}
}
