package blog.valerioemanuele.adapter.driven;

import blog.valerioemanuele.hexagon.drivenport.fornotifyingmessages.Notify;

public class NotifyConsoleAdapter implements Notify {

	@Override
	public void notify(String subject, String message) {
		System.out.println(subject);
		System.out.println(message);		
	}

}
