package blog.valerioemanuele.spi;

import java.util.Collection;
import java.util.Optional;

import blog.valerioemanuele.model.User;

public interface UserRepository {
	Optional<Collection<User>> findUsersBornOn(int month, int dayOfMonth);
}
