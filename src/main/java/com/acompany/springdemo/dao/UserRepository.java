package com.acompany.springdemo.dao;


import com.acompany.springdemo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class UserRepository {

    public void pri(){
        System.out.println(users);
    }

    public static List<User> users;

    //public void UserServiceImple() {
    static {
        users = new ArrayList<User>();
        users.add(new User(100, "kim"));
        users.add(new User(200, "lee"));
        users.add(new User(300, "choi"));
        users.add(new User(400, "park"));
        users.add(new User(500, "kwon"));
        users.add(new User(600, "hwang"));
    }

    public Map<String, String> getMessage(){
        Map<String, String> res = new HashMap<>();
        res.put("greet","Hello world");
        return res;
    }

    //사용자 전체보기
    public List<User> getAllUsers(){

        System.out.println("사용자 전체보기::repository..");
        return users;
    }
    //사용자 상세보기
    public User getUserByUserid(Integer userid){
        System.out.println("사용자 상세보기::repository.."+userid);
        
        return users.stream()
                .filter(user -> user.getUserid().equals(userid))
                .findAny()
                .orElse(new User(0, "no user"));
    }
    //사용자등록
    public User insertUser(User user){
        users.add(user);
        return  user;
    }
    //사용자수정
    public void updateUser(User user){
        System.out.println("사용자 수정::repository..");
         users.stream()
                .filter(item -> item.getUserid().equals(user.getUserid()))
                .findAny()
                .orElse(new User(0, "no user"))
                .setUsername(user.getUsername());
    }
    //사용자 삭제
    public void deleteUser(Integer userid){
        System.out.println("사용자 삭제::repository..");
        users.removeIf(user -> user.getUserid().equals(userid) );
    }
}
