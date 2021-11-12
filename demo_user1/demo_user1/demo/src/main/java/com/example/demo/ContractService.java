package com.example.demo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ContractService {

    @Autowired
    private ContractRepository repo;

    public List<Contract> listAll() {
        return repo.findAll();
    }

    public void save(Contract content) {
        repo.save(content);
    }

    public Contract get(String name) {
        return repo.findById(name).get();
    }

    public void delete(String name) {
        repo.deleteByUsername(name); //username - primary key in the Contract table
    }   
    
}
