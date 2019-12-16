package com.cognizant.vehiclereservationsystem.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static Date convertToDate(String date) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY");
		Date convertedDate = (Date) simpleDateFormat.parse(date);
		return convertedDate;
		
	}

}
