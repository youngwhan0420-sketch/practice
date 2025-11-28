package repository;

import entity.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository {
    @Autowired
    private UserMapper userMapper;

    public Optional<User> getUserByUsername (String username) {
        return userMapper.getUserByUsername(username);
    }
    public Optional<User> getUserByUserId (Integer userId) {
        return userMapper.getUserByUserId(userId);
    }
    public int updatePassword(User user) {
        return userMapper.updatePassword(user);
    }

}
