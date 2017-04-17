package flf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flf.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

//	List<Map<String, Object>> querySomeList(String str);
}
