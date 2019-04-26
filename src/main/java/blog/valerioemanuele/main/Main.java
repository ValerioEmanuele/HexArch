package blog.valerioemanuele.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import blog.valerioemanuele.adapter.driven.NotifyConsoleAdapter;
import blog.valerioemanuele.adapter.driven.UserRepositoryFileAdapter;
import blog.valerioemanuele.adapter.driver.TestBirthdayServiceAdapter;
import blog.valerioemanuele.hexagon.drivenport.fornotifyingmessages.Notify;
import blog.valerioemanuele.hexagon.drivenport.forpersistingdata.UserRepository;
import blog.valerioemanuele.hexagon.driverport.formanagingbirthdays.BirthdayService;

public class Main {

	public static void main(String[] args) {
		Class[] constructorArgumentsClass = new Class[] { UserRepository.class, Notify.class };
		//driven adapters
		Object[] constructorArguments = new Object[] { new UserRepositoryFileAdapter(), new  NotifyConsoleAdapter() };
		BirthdayService birthdayService;
		
		try {
			//instantiate the hexagon
			Constructor<?> birthdayServiceImplConst = Class.forName("blog.valerioemanuele.hexagon.internal.BirthdayServiceImpl").getDeclaredConstructor(constructorArgumentsClass);
			birthdayServiceImplConst.setAccessible(true);
			birthdayService = (BirthdayService) birthdayServiceImplConst.newInstance(constructorArguments);

			//driver adapter
			TestBirthdayServiceAdapter testBirthdayServiceAdapter = new TestBirthdayServiceAdapter(birthdayService);
			testBirthdayServiceAdapter.run();
						
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}

}
