package cn.kygl.controller.user;

import cn.kygl.entity.User;
import cn.kygl.service.user.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * * 根据用户的ID查询用户的信息
     */
    @RequestMapping(value = "byId", method = RequestMethod.POST)
    @ApiOperation(value = "通过用户ID来查询用户的相关信息", notes = "最初接口模型")
    public String findByUserId() {
        User user = userService.findByUserId(1001);
        System.out.println("根据ID查询用户信息："+user.toString());
        return "";
    }

    /**
     * 查询全部用户的信息
     */
    /**
     * 根据用户的姓名查询用户的信息
     */
    @RequestMapping(value = "byName", method = RequestMethod.POST)
    @ApiOperation(value = "根据用户的姓名在查找用户的相关信息", notes = "最初接口模型")
    public String findAll() {
        List<User> users = userService.findAll();
        for (User user: users) {
            System.out.println("查询结果是："+user.toString());
        }
        return "";
    }
}