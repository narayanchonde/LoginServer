package com.app.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="app_user_tab")
@Data
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String username;
	
	private String password;
	
	@ElementCollection(fetch=FetchType.EAGER)
	private List<String> roles;
  
}
