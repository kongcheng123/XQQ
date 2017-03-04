package com.xy.dao;

import com.xy.entity.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by xy on 2016/12/23.
 */
@Transactional
public interface UserDao extends CrudRepository<User,Integer> {
}
