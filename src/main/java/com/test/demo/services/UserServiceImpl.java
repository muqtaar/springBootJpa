package com.test.demo.services;

import com.test.demo.dto.userDto;
import com.test.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.demo.repository.UserRepo;

import java.util.List;

/**
 * @author Mohammed Muqtaar
 * @since {11/7/2018}
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo repo;

    @Override
    public User signup(User users) {
        User user = repo.save(users);
        return user;
    }

    @Override
    public User findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<User> findAll() {
        return repo.findAll();
    }

    @Override
    public List<User> findByrole(String role) {
        return repo.findByrole(role);
    }

    @Override
    public User update(userDto dto) {
        //check id service
        User user = new User();

        user = repo.findById(dto.getId());

        if (user == null) {
            return null;
        } else {
            user.setName(dto.getName());
            user.setEmail(dto.getEmail());
            user.setMobile(dto.getMobile());
            user.setPlace(dto.getPlace());
            return repo.save(user);
        }
    }

    @Override
    public User delete(Integer id) {
        User user = new User();
        user = repo.findById(id);

        if (user == null){

            System.out.print("User NOT Found");
        }
        else{

            repo.delete(user);
        }


        return user;
    }


}
