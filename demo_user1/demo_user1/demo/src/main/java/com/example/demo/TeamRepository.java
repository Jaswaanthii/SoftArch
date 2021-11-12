package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called TeamRepository
// CRUD refers Create, Read, Update, Delete

public interface TeamRepository extends JpaRepository<Team, String> {

    public void deleteByName(String name); //name - primary key in the Team table

}
