package com.james;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by jamesyburr on 6/21/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    public User findByName(String username);
}
