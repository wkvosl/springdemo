package com.acompany.springdemo.controller;

import com.acompany.springdemo.model.User;
import com.acompany.springdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    //로그 사용할때~
    private static final Logger logger =
            LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    public Map<String, String> getMessage() {
        return userService.getMassage();
    }

    @GetMapping("")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{userid}")
    public User getUsersByUserid(@PathVariable Integer userid){
        //로그는 이렇게
        logger.debug(""+userid); //""+userid ->userid가 String이 됐음.
        return userService.getUserById(userid);
    }

    @PostMapping("")
    public User regiUser(@RequestBody User user){
        //User user = ...();  //컨트롤러에서는 User 정보를 확보해야함.
        //여기서는 어노테이션 RequestBody로 pass함
        return userService.regiUser(user);
    }

    @PutMapping("/{userid}")
    public void modifyUser(@PathVariable Integer userid,
                           @RequestBody User user){
        userService.modifyUser(userid, user);
    }

    @DeleteMapping("/{userid}")
    public  void removeUser(@PathVariable Integer userid){
        userService.removeUser(userid);
    }
}
