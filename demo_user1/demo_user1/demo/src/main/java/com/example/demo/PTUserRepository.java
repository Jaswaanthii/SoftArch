package com.example.demo;

import javax.transaction.Transactional;

@Transactional
public interface PTUserRepository extends UserBaseRepository<PTUser> { }

