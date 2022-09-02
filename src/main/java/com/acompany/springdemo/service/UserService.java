package com.acompany.springdemo.service;

import com.acompany.springdemo.dao.UserRepository;
import com.acompany.springdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    //외부리소스 (데이터소스)
  @Autowired
  private UserRepository userRepository;


  public List<User> getAllUsers(){
      return  userRepository.getAllUsers();
  }

  public User getUserById(Integer userid){
      return userRepository.getUserByUserid(userid);
  }

  public User regiUser(User user){
      return userRepository.insertUser(user);
  }

    public Map<String, String> getMassage() {
        return  userRepository.getMessage();
    }

    public void  modifyUser(Integer userid, User user){
      user.setUserid(userid);
      userRepository.updateUser(user);
    }

    public void removeUser(Integer userid){
      userRepository.deleteUser(userid);
    }
}
