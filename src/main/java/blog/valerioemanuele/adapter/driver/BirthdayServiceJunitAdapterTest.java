package blog.valerioemanuele.adapter.driver;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;

import blog.valerioemanuele.hexagon.driverport.formanagingbirthdays.BirthdayService;

@TestInstance(Lifecycle.PER_CLASS) 
@ExtendWith(BirthdayServiceParameterResolver.class)
public class BirthdayServiceJunitAdapterTest {

	private BirthdayService birthdayService;
	
	public BirthdayServiceJunitAdapterTest(BirthdayService birthdayService) {
		this.birthdayService = birthdayService;
	}
	
	@Test
	public void testOfExistingUser() {
		LocalDate testDate = LocalDate.of(0, 10, 27);
		assertDoesNotThrow(() -> birthdayService.wishHappyBirthday(testDate));
	}

}
