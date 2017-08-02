package com.itmuch.cloud.repository;

import com.itmuch.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jiaozhiguang on 2017/7/15.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
