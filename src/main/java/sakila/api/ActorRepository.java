package sakila.api;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ActorRepository extends JpaRepository<Actor, Integer> {}