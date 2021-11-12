package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class User {
    @Id
    @Column(name="username")
    private String username; 

    @Column(name = "email")
    private String email;

    @Column(name = "dtype",  insertable=false, updatable=false) 
    private String dtype;

    @Column(name="team")
    private String team;

    @Column(name="contract")
    private String contract;
     
    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }
    
    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }
    
    //obtain the Contract object
    public Contract constructContractObject() {  
        Contract contractObj = new Contract();  // composition
        contractObj.setUsername(this.username);
        contractObj.setContract(this.contract);  
        return contractObj;
    }
    
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
