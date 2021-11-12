package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teamuser")
public class TeamUser {

    @Id
    @Column(name = "username")  //username - primary key in the TeamUser table
    private String username;

    @Column(name = "name")
    private String name;

    public String getUser() {
        return username;
    }

    public void setUser(String name) {
        this.username = name;
    }

    public String getTeam() {
        return name;
    }

    public void setTeam(String team) {
        this.name = team;
    }  
}
