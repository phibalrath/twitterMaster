package com.tts.techtalenttwitter.model;


import javax.persistence.*;

//Role is for Spring Security when you have different authorization methods. In this case though, we all have the same authorization
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long id;
    private String role;
	
    public Role() {
	
	}

	public Role(Long id, String role) {
		this.id = id;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
    
    
    
}
