package com.xy.dao;

import com.xy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by xy on 2016/12/23.
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
