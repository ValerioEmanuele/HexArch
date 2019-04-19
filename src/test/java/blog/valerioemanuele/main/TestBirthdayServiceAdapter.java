package blog.valerioemanuele.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import blog.valerioemanuele.adapter.driven.NotifyConsoleAdapter;
import blog.valerioemanuele.adapter.driven.UserRepositoryFileAdapter;
import blog.valerioemanuele.hexagon.drivenport.fornotifyingmessages.Notify;
import blog.valerioemanuele.hexagon.drivenport.forpersistingdata.UserRepository;
import blog.valerioemanuele.hexagon.driverport.formanagingbirthdays.BirthdayService;

class TestBirthdayServiceAdapter {

	private BirthdayService birthdayService;
	
	private Class[] constructorArgumentsClass = new Class[] { UserRepository.class, Notify.class };
	Object[] constructorArguments = new Object[] { new UserRepositoryFileAdapter(), new  NotifyConsoleAdapter() };
	
	
	@Test
	void test() throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<?> birthdayServiceImplConst = Class.forName("blog.valerioemanuele.hexagon.internal.BirthdayServiceImpl").getDeclaredConstructor(constructorArgumentsClass);
		birthdayServiceImplConst.setAccessible(true);
		birthdayService = (BirthdayService) birthdayServiceImplConst.newInstance(constructorArguments);
		
		LocalDate testDate = LocalDate.of(0, 10, 27);
		birthdayService.wishHappyBirthday(testDate);
	}

}
