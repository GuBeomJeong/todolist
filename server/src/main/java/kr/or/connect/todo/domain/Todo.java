package kr.or.connect.todo.domain;

import java.sql.Date;

public class Todo {
	private Integer id;
	private String todo;
	private Integer completed;
	private String date;
	
	public Todo(){
		//java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
		//java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());

		
		//this.date = sqlDate.toString();
		this.completed = 0;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public Integer getCompleted() {
		return completed;
	}
	public void setCompleted(Integer completed) {
		this.completed = completed;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
