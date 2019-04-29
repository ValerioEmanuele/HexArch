package blog.valerioemanuele.hexagon.internal;

import java.time.LocalDate;

import blog.valerioemanuele.hexagon.dto.UserData;

class User {
	private String name;
	private String surname;
	private String email;
	private LocalDate birthDate;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isBirthday(int monthValue, int dayOfMonth) {
		return this.birthDate.getDayOfMonth() == dayOfMonth 
				&& this.birthDate.getMonthValue() == monthValue;
	}

	public static User fromUserData(UserData ud) {
		User u = new User();
		u.setName(ud.name());
		u.setSurname(ud.surname());
		u.setEmail(ud.email());
		u.setBirthDate(ud.birthDate());
		return u;
	}
}