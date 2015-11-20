package com.abc;

import java.util.Calendar;
import java.util.Date;

public class DateProvider {
    private static DateProvider instance = null;

    public static DateProvider getInstance() {
        if (instance == null)
            instance = new DateProvider();
        return instance;
    }

    public Date now() {
        return Calendar.getInstance().getTime();
    }
    
	public long findDayDiff(Date lastTransDate, Date nowDate) {

		long diff = (nowDate.getTime() - lastTransDate.getTime()) - 86400000;
		
		return (diff / (24 * 60 * 60 * 1000) + 1);

	}
}
