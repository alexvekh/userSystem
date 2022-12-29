package com.boocrun.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boocrun.model.User;
import com.boocrun.service.UserService;

@Controller
@RequestMapping("/users")
public class UserConroller {
  
  @Autowired
  private UserService userService;
  
  public @ResponseBody
  List<User> getAllUsers(){
        return userService.getAllUsers();
  }
}
