package com.example.StockMarketChartingApp.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.StockMarketChartingApp.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
// 	@Query User loginUser(String userName,String password);
	
	@Query("Select u from User u where u.email = :email ")
	User findByEmail(@Param("email") String email);
	
	@Query("Select u from User u where u.id = :id ")
	User findUserById(@Param("id") int id);
	
	@Modifying
	@Transactional
	@Query("Update User u set password = :password where u.id = :id ")
	Optional<User> updateUser(@RequestBody String password, @Param("id") int id);	
}
