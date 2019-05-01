package blog.valerioemanuele.hexagon.internal;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import blog.valerioemanuele.hexagon.drivenport.fornotifyingmessages.Notify;
import blog.valerioemanuele.hexagon.drivenport.forpersistingdata.UserData;
import blog.valerioemanuele.hexagon.drivenport.forpersistingdata.UserRepository;
import blog.valerioemanuele.hexagon.driverport.formanagingbirthdays.BirthdayService;

class BirthdayServiceImpl implements BirthdayService{

	private UserRepository userRepository;
	private Notify notify;
	
	
	public BirthdayServiceImpl(UserRepository userRepository, Notify notify) {
		super();
		this.userRepository = userRepository;
		this.notify = notify;
	}

	public void wishHappyBirthday(LocalDate birthDay) {
		Optional<Collection<UserData>> userData = userRepository.findUsersBornOn(birthDay.getMonthValue(), birthDay.getDayOfMonth());
		userData.ifPresent(
				uc -> uc.stream().forEach(
						ud -> notify.notify("Happy birthday!", wishMessage(User.fromUserData(ud)))
				));
	}
	
	private String wishMessage (User aUser) {
		return MessageFormat.format("Happy birthday {0}!", aUser.getName());
	}
}
