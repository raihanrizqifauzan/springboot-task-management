package com.raihan.todolist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raihan.todolist.model.User;

public interface UserRepository extends JpaRepository<User, String> {

	List<User> findByNameLike(String name);

}
