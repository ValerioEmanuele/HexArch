package blog.valerioemanuele.adapter.driver;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import blog.valerioemanuele.hexagon.driverport.formanagingbirthdays.BirthdayService;
import blog.valerioemanuele.main.HexagonFactory;

public class BirthdayServiceParameterResolver implements ParameterResolver{

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		return parameterContext.getParameter().getType() == BirthdayService.class;
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		try {
			return HexagonFactory.instance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
