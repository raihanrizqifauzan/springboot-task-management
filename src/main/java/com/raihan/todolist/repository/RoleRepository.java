package com.raihan.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raihan.todolist.model.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
