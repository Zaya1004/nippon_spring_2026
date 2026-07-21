package mn.icode.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.icode.model.Clubs;

@Repository
public interface ClubRepository extends JpaRepository<Clubs, Long>{

	Optional<Clubs> findByName(String name);
	
	List<Clubs> findByIsActiveTrue();
	
	List<Clubs> findByCategory(String category);
}
