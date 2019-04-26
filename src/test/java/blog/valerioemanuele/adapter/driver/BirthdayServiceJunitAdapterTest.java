package blog.valerioemanuele.adapter.driver;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import blog.valerioemanuele.adapter.driven.NotifyConsoleAdapter;
import blog.valerioemanuele.adapter.driven.UserRepositoryFileAdapter;
import blog.valerioemanuele.hexagon.drivenport.fornotifyingmessages.Notify;
import blog.valerioemanuele.hexagon.drivenport.forpersistingdata.UserRepository;
import blog.valerioemanuele.hexagon.driverport.formanagingbirthdays.BirthdayService;

@TestInstance(Lifecycle.PER_CLASS) 
public class BirthdayServiceJunitAdapterTest {

	//driver port
	private BirthdayService birthdayService;
	
	//driven ports
	Class[] constructorArgumentsClass = new Class[] { UserRepository.class, Notify.class };
	//driven adapters
	Object[] constructorArguments = new Object[] { new UserRepositoryFileAdapter(), new  NotifyConsoleAdapter() };
	
	@BeforeAll
	void before() throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//the hexagon instance
		Constructor<?> birthdayServiceImplConst = Class.forName("blog.valerioemanuele.hexagon.internal.BirthdayServiceImpl").getDeclaredConstructor(constructorArgumentsClass);
		birthdayServiceImplConst.setAccessible(true);
		birthdayService = (BirthdayService) birthdayServiceImplConst.newInstance(constructorArguments);
	}
	
	@Test
	void testOfExistingUser() {
		LocalDate testDate = LocalDate.of(0, 10, 27);
		assertDoesNotThrow(() -> birthdayService.wishHappyBirthday(testDate));
	}

}
