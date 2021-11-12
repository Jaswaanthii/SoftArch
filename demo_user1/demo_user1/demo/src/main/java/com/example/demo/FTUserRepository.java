package com.example.demo;

import javax.transaction.Transactional;

@Transactional
public interface FTUserRepository extends UserBaseRepository<FTUser> { }

