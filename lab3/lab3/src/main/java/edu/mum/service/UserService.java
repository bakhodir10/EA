package edu.mum.service;

import edu.mum.domain.User;

public interface UserService extends GenericService<User> {

    User findByEmail(String email);
}
