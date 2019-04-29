package blog.valerioemanuele.main;

import java.lang.reflect.Constructor;

import blog.valerioemanuele.adapter.driven.NotifyConsoleAdapter;
import blog.valerioemanuele.adapter.driven.UserRepositoryFileAdapter;
import blog.valerioemanuele.hexagon.drivenport.fornotifyingmessages.Notify;
import blog.valerioemanuele.hexagon.drivenport.forpersistingdata.UserRepository;
import blog.valerioemanuele.hexagon.driverport.formanagingbirthdays.BirthdayService;

public class HexagonFactory {

	static Class[] constructorArgumentsClass = new Class[] { UserRepository.class, Notify.class };
	// driven adapters
	static Object[] constructorArguments = new Object[] { new UserRepositoryFileAdapter(), new NotifyConsoleAdapter() };

	public static BirthdayService instance() throws Exception {
		// instantiate the hexagon
		Constructor<?> birthdayServiceImplConst = Class
				.forName("blog.valerioemanuele.hexagon.internal.BirthdayServiceImpl")
				.getDeclaredConstructor(constructorArgumentsClass);
		birthdayServiceImplConst.setAccessible(true);
		return (BirthdayService) birthdayServiceImplConst.newInstance(constructorArguments);
	}

}
