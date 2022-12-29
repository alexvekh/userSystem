package com.boocrun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boocrun.dao.UserDao;

@Service
public class UserService {
  
  @Autowired
  private UserDao userDao;
  public List getAllUsers() {
    return userDao.getAllUsers();
  }
  
}
