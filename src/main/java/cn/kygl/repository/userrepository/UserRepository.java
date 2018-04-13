package cn.kygl.repository.userrepository;

import cn.kygl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(Integer userId);

    List<User> findAll();
}