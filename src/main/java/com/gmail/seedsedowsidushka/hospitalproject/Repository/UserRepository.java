package com.gmail.seedsedowsidushka.hospitalproject.Repository;

import com.gmail.seedsedowsidushka.hospitalproject.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByUsername(String name);
}
