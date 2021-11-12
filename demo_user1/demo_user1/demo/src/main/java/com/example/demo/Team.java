package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {
    private String name;
    
    @Id
    @Column(name="name")
    public String getName() {
        return name;
    }
    
    public void setName(String str) {
		this.name = str;
    } 

}
