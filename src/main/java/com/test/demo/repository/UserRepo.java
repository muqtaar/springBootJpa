package com.test.demo.repository;

import com.test.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mohammed Muqtaar
 * @since {11/7/2018}
 */
@Repository
public interface UserRepo extends JpaRepository<User, String> {
    public User findById(Integer id);
    public List<User> findAll();
    public List<User> findByrole(String role);
}
