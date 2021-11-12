package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called TeamUserRepository
// CRUD refers Create, Read, Update, Delete

public interface TeamUserRepository extends JpaRepository<TeamUser, String> {

    public void deleteByUsername(String username);  //username - primary key in the TeamUser table

}
