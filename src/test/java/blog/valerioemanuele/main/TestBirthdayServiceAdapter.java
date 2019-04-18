package blog.valerioemanuele.main;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import blog.valerioemanuele.hexagon.driverport.formanagingbirthdays.BirthdayService;

class TestBirthdayServiceAdapter {

	private final BirthdayService birthdayService;
	
	public TestBirthdayServiceAdapter(BirthdayService birthdayService) {
		this.birthdayService = birthdayService;
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
