package blog.valerioemanuele.hexagon.drivenport.forpersistingdata;

import java.util.Collection;
import java.util.Optional;

import blog.valerioemanuele.hexagon.dto.UserData;

public interface UserRepository {
	Optional<Collection<UserData>> findUsersBornOn(int month, int dayOfMonth);
}
