package com.springboot.pp_3_1_1_springboot.repository;

import com.springboot.pp_3_1_1_springboot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
