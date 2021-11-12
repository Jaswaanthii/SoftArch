package com.example.demo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TeamService {

    @Autowired
    private TeamRepository repo;

    public List<Team> listAll() {
        return repo.findAll();
    }

    public void save(Team content) {
        repo.save(content);
    }

    public Team get(String name) {
        return repo.findById(name).get();
    }

    public void delete(String name) {
        repo.deleteByName(name); //name - primary key in the Team table
    }   
    
}

