package com.test.demo.controller;

import com.test.demo.dto.userDto;
import com.test.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.test.demo.services.UserService;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Mohammed Muqtaar
 * @since {11/7/2018}
 */
@RestController
public class UserController {

   @Autowired
    public UserService userService;

    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public User SignUp(@RequestBody User users) {
        return userService.signup(users);
    }

    @RequestMapping("/users/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    @RequestMapping("/allUsers")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/byRole/{role}")
    public List<User> findByrole(@PathVariable("role") String role){
        return userService.findByrole(role);
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable("id") String id ,@RequestBody userDto dto) {
        return userService.update( dto);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public User delete(@PathVariable("id") Integer id) {
        return userService.delete(id);
    }
}
