package com.basicprogramming.task.test;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import com.utility.Utility;

public class TImeTest {
	public static void main(String[] args) {
	ZoneId zone = ZoneId.of("America/New_York");
	System.out.print(zone.getRules());
	//System.out.println("Enter date ");
	//LocalDateTime local = LocalDateTime.now();
	System.out.println(ZonedDateTime.of(2024,06,10,1,30,0,0, zone).getOffset());
	}
}
