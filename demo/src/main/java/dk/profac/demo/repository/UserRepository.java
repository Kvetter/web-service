package dk.profac.demo.repository;

import dk.profac.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);

    public int deleteByUsername(String username);
}
