package com.shared.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class Utils {

	/**
	 * @param object
	 * @return
	 */
	public static <T> Boolean isPresent(T object) {
		Optional<T> optional = Optional.ofNullable(object);
		return optional.isPresent();
	}

	public static Date parseDate(String date) throws ParseException {
		SimpleDateFormat dateFormatter = new SimpleDateFormat(Constants.DATE_FORMATE);
		return dateFormatter.parse(date);
	}
}
