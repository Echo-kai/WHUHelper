package architecture.service;

import architecture.pojo.User;

import java.util.List;

public interface UserService {
    User getUser(Long id);

    String getPassword(Long id);

    List<User> getAllUser();
}
