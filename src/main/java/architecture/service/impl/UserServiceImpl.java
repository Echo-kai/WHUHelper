package architecture.service.impl;

import architecture.dao.UserDao;
import architecture.pojo.User;
import architecture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao = null;

    @Override
    public String getPasswordByUsername(String username) {
        return userDao.getPasswordByUsername(username);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    public String getPassword(Long id) {
        return userDao.getPassword(id);
    }

    @Override
    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

    @Override
    public Long getIdByUsername(String username) {
        return userDao.getIdByUsername(username);
    }
}
