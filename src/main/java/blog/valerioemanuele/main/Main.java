package blog.valerioemanuele.main;

import blog.valerioemanuele.adapter.driver.BirthdayServiceJunitAdapterTest;

public class Main {

	public static void main(String[] args) {
		try {
			//driver adapter
			BirthdayServiceJunitAdapterTest testBirthdayServiceAdapter = new BirthdayServiceJunitAdapterTest();
			testBirthdayServiceAdapter.testOfExistingUser(HexagonFactory.instance());
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
