package com.acompany.springdemo.service;

import com.acompany.springdemo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTests {

    @Autowired
    private UserService userService;

   /* @Test
    public void testRegiUser(){
        //regi는 insert가 되지 않으면 예외가 발생되기 때문에
        //Assert안써도 test 통과로 간주한다.
        User user = new User(1000,"kkkim");
        User res = userService.regiUser(user);
    }*/

}
