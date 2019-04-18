package blog.valerioemanuele.adapter.driven;

import java.time.LocalDate;

import blog.valerioemanuele.hexagon.drivenport.forpersistingdata.UserData;
import lombok.Builder;
import lombok.Data;

@Builder @Data
public class UserDataAdapter implements UserData {

	private String name;
	private String surname;
	private String email;
	private LocalDate birthDate;
	
	
	@Override
	public String name() {
		return this.name;
	}

	@Override
	public String surname() {
		return this.surname;
	}

	@Override
	public String email() {
		return this.email;
	}

	@Override
	public LocalDate birthDate() {
		return this.birthDate;
	}

}
