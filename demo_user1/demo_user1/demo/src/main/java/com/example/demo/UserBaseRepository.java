package com.example.demo;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserBaseRepository<T extends User> extends JpaRepository<T, String> {

    public T findByDtype(String mode);
    public void deleteByUsername(String username);

}