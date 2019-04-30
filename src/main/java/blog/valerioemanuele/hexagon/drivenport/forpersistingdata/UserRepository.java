package blog.valerioemanuele.hexagon.drivenport.forpersistingdata;

import java.util.Collection;
import java.util.Optional;

public interface UserRepository {
	Optional<Collection<UserData>> findUsersBornOn(int month, int dayOfMonth);
}
