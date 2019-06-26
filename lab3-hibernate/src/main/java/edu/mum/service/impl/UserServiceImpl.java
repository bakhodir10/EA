package edu.mum.service.impl;

import edu.mum.dao.UserDao;
import edu.mum.domain.User;
import edu.mum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User> implements UserService {

    @Autowired
    private UserDao userDao;

    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

}
