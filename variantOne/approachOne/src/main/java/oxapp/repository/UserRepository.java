package oxapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import oxapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
