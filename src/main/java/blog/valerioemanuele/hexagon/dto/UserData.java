package blog.valerioemanuele.hexagon.dto;

import java.time.LocalDate;


public interface UserData {
	
	public String name();

	public String surname();

	public String email();

	public LocalDate birthDate();
	
	default boolean isBirthday(int monthValue, int dayOfMonth) {
		return this.birthDate().getDayOfMonth() == dayOfMonth 
				&& this.birthDate().getMonthValue() == monthValue;
	}

}
