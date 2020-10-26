package architecture.service;

import architecture.pojo.User;

import java.util.List;

public interface UserService {
    User getUser(Long id);

    String getPassword(Long id);

    String getPasswordByUsername(String username);

    List<User> getAllUser();

    Long getIdByUsername(String username);
}
