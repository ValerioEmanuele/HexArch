package blog.valerioemanuele.hexagon;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import blog.valerioemanuele.api.BirthdayService;
import blog.valerioemanuele.model.User;
import blog.valerioemanuele.spi.Notify;
import blog.valerioemanuele.spi.UserRepository;

class BirthdayServiceImpl implements BirthdayService{

	private UserRepository userRepository;
	private Notify notify;
	
	
	public BirthdayServiceImpl(UserRepository userRepository, Notify notify) {
		super();
		this.userRepository = userRepository;
		this.notify = notify;
	}

	public void wishHappyBirthday(LocalDate birthDay) {
		Optional<Collection<User>> users = userRepository.findUsersBornOn(birthDay.getMonthValue(), birthDay.getDayOfMonth());
		users.ifPresent(uc -> uc.stream()
								.forEach(u -> notify.notify("Happy birthday!", wishMessage(u))
						));
	}
	
	private String wishMessage(User u) {
		return MessageFormat.format("Happy birthday {0}!", u.getName());
	}
}
