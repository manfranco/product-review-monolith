package co.edu.eafit.productmonolith.repository;

import co.edu.eafit.productmonolith.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
