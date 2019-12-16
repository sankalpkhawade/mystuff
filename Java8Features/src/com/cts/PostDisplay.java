package com.cts;

import java.time.Duration;
import java.time.LocalTime;

public class PostDisplay {

	public static void main(String[] args) {

		PostDisplay pd = new PostDisplay();
		pd.testDuration();

	}

	public void testDuration() {
		LocalTime time1 = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);

		LocalTime time2 = time1.plus(twoHours);
		Duration duration = Duration.between(time1, time2);

		System.out.println("Duration: " + duration);
	}

}
