package com.shared.common.response;

import java.util.List;

public interface Page<T> {
	public List<T> getElements();
	public void setElements(List<T> elements);
}
