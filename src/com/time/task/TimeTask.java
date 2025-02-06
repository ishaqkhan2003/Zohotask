package com.time.task;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneRulesException;
import java.util.Arrays;

import com.exceptionhandling.DataValidationException;
import com.utility.Utility;
public class TimeTask {


	public DateTimeFormatter getFormatter(String string)throws DataValidationException{
		Utility.checkNull(string);
		return DateTimeFormatter.ofPattern(string);
	}

	public long  getSystemCurrentMillis() {
		return System.currentTimeMillis();
	}
	public long getTimeInMillis() {
		return Instant.now().toEpochMilli();
	}
	public String getZonedDateTime(ZoneId zone,String format)throws DataValidationException {
		Utility.checkNull(zone);
		return	ZonedDateTime.now(zone).format(getFormatter(format));
	}

	public ZoneId getZoneId(String zone)throws DataValidationException,DateTimeException,ZoneRulesException {
		Utility.checkNull(zone);
		return ZoneId.of(zone);
	}
	public Instant getInstantOfEpochMilli(long millis) throws DataValidationException {
		Utility.checkNull(millis);
		return Instant.ofEpochMilli(millis);
	}
	public DayOfWeek getDayOfWeekFromMillis(long millis,ZoneId zone) throws DataValidationException {
		Utility.checkNull(zone);
		ZonedDateTime zoneDT = getInstantOfEpochMilli(millis).atZone(zone);
		return zoneDT.getDayOfWeek();
	}
	public Month getMonthFromMillis(long millis,ZoneId zone) throws DataValidationException {
		Utility.checkNull(zone);
		ZonedDateTime zoneDT = getInstantOfEpochMilli(millis).atZone(zone);
		return zoneDT.getMonth();
	}
	public int getYearFromMillis(long millis,ZoneId zone) throws DataValidationException {
		Utility.checkNull(zone);
		ZonedDateTime zoneDT = getInstantOfEpochMilli(millis).atZone(zone);
		return zoneDT.getYear();
	}
	public String[] getSortedAvailableZoneId() {
		String[] zoneId = ZoneId.getAvailableZoneIds().toArray( new String[0]);
		Arrays.sort(zoneId);
		return zoneId;
	}
	public ZoneOffset getDSTOffset(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone) {
		return ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, zone).getOffset();
	}
	
}
