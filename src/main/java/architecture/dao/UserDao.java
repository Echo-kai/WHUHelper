package architecture.dao;

import architecture.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    User getUser(Long id);

    String getPassword(Long id);

    Long getIdByUsername(String username);

    String getPasswordByUsername(String username);

    List<User> getAllUser();
}
