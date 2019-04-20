package blog.valerioemanuele.adapter.driver;

import java.time.LocalDate;

import blog.valerioemanuele.hexagon.driverport.formanagingbirthdays.BirthdayService;

/*
 * Test
 * Driver Adapter
 * Uses BirthdayService Driver Port
 */
public class TestBirthdayServiceAdapter {

	private final BirthdayService birthdayService;
	
	public TestBirthdayServiceAdapter(BirthdayService birthdayService) {
		this.birthdayService = birthdayService;
	}

	public void run() {
		LocalDate testDate = LocalDate.of(0, 10, 27);
		birthdayService.wishHappyBirthday(testDate);
	}
	
}
