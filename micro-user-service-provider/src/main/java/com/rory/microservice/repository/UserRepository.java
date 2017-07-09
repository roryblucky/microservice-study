package com.rory.microservice.repository;

import com.rory.microservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by RoryGao on 2017/7/9.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
