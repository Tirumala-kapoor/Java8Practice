package com.newapi.features.streams.programming.emp;

public class Dept {
	private long id;
	private String name;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + "]";
	}

}
