package com.raihan.todolist;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.raihan.todolist.model.Task;
import com.raihan.todolist.model.User;
import com.raihan.todolist.service.TaskService;
import com.raihan.todolist.service.UserService;

@SpringBootTest
class SpringbootTodolistApplicationTests {
	
//	@Autowired
//	private UserService userService;
//	@Autowired
//	private TaskService taskService;
//
//	public void initDb() {
//		{
//			User newUser = new User("raihan@gmail.com", "Raihan", "123456");
//			userService.createUser(newUser);
//		}
//		{
//			User newAdmin = new User("rizqi@gmail.com", "Rizqi", "123456");
//			userService.createAdmin(newAdmin);
//		}
//		Task userTask = new Task("12/12/2020", "23.15", "Welcome to this Work");
//		ResponseEntity<User> user = userService.findOne("raihan@gmail.com");
//		taskService.addTask(userTask, user);
//	}

}
