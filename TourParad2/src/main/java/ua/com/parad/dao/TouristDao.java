package ua.com.parad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.parad.entity.Tourist;

public interface TouristDao extends JpaRepository <Tourist, Integer>{
	
	public Tourist findByName(String name);
	
	@Query("SELECT CASE WHEN COUNT(t) > 0 THEN true ELSE false END FROM Tourist t WHERE t.email =:email")
	public boolean findByEmail(@Param("email") String email);
	
	public Tourist findByPhone(int phone);
	
	@Query("Select t from Tourist t where t.uuid =:uuid")
	public Tourist findByUuid(@Param("uuid")String uuid);

}
