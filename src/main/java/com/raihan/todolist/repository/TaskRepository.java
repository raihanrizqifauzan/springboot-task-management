package com.raihan.todolist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raihan.todolist.model.Task;
import com.raihan.todolist.model.User;

public interface TaskRepository extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user);

}
