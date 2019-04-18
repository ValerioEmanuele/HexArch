package blog.valerioemanuele.adapter.driver;

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
		System.out.println("Testing BirthdayService...");
	}
	
}
