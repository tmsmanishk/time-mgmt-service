package com.example.demo.repository;

import com.example.demo.entity.UserDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Manish
 */
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>{

	@Query("SELECT u FROM UserDetails u WHERE u.userId=:userId")
	UserDetails findByUserId(@Param("userId") String userId);
	
	@Query("SELECT u FROM UserDetails u WHERE u.username=:username")
	UserDetails findByUsername(@Param("username") String username);

	@Query("SELECT u.id FROM UserDetails u ORDER BY u.id DESC")
	List<Long> getLastId();
}
