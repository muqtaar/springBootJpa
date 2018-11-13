package com.test.demo.services;

import com.test.demo.dto.userDto;
import com.test.demo.entity.User;

import java.util.List;

/**
 * @author Mohammed Muqtaar
 * @since {11/7/2018}
 */
public interface UserService {

    User signup(User users);
    public User findById(Integer id);
    public List<User> findAll();
    public List<User> findByrole(String role);
    public User update( userDto dto);
    public User delete(Integer id);

}
