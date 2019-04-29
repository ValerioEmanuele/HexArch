package blog.valerioemanuele.main;

import blog.valerioemanuele.adapter.driver.BirthdayServiceJunitAdapterTest;

public class Main {

	public static void main(String[] args) {
		try {
			//driver adapter
			BirthdayServiceJunitAdapterTest testBirthdayServiceAdapter = new BirthdayServiceJunitAdapterTest(HexagonFactory.instance());
			testBirthdayServiceAdapter.testOfExistingUser();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
