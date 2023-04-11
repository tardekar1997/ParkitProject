package com.parkit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.parkit.entity.User;

 public interface UserRepository extends JpaRepository<User, Integer> {
	 User findByUsername(String username);
}
