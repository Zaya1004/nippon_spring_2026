package mn.icode.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mn.icode.model.Clubs;
import mn.icode.model.Members;

public interface MemberRepository extends JpaRepository<Members, Long>{

//	Optional<Members> findByName(String name);
//	
//	List<Members> findByIsActiveTrue();
//	
//	List<Members> findByCategory(String category);
}
