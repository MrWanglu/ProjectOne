package cn.kygl.service.user;

import cn.kygl.entity.User;
import cn.kygl.repository.userrepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUserId(Integer userId) {
        return userRepository.findByUserId(userId);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}