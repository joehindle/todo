package com.qa.todo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.todo.model.TodoItem;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {

	List<TodoItem> findAll();

}
