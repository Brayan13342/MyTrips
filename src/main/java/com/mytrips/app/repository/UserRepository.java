package com.mytrips.app.repository;

import com.mytrips.app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Query(value = "SELECT * FROM tbl_user u WHERE u.email = :email AND u.password = :password", nativeQuery = true)
    Optional<UserEntity> findUser(String email, String password);
}