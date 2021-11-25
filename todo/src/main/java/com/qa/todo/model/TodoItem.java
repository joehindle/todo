package com.qa.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class TodoItem {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String title;
	@Column
	private boolean done;
	
	
	
	public TodoItem() {
	}

	
	public TodoItem(Long id, String title, boolean done) {
		this.id = id;
		this.title = title;
		this.done = done;
	}

	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isDone() {
		return done;
	}


	public void setDone(boolean done) {
		this.done = done;
	}
}
