package com.mytrips.app.controller;

import com.mytrips.app.entity.UserEntity;
import com.mytrips.app.service.IUserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private IUserService serviceUser;

    @GetMapping("/user")
    public List<UserEntity> buscarTodos(){
        return serviceUser.buscarTodos();
    }

    @PostMapping("/login")
    public Optional<UserEntity> login(@RequestBody Map<String, String> payload){
        System.out.println(payload);
        String email = payload.get("email");
        String password = payload.get("password");
        Optional<UserEntity> user = serviceUser.findUser(email, password);
        System.out.println(user);
        return user;
    }

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity signUp(@RequestBody UserEntity userEntity){
        serviceUser.createUser(userEntity);
        return userEntity;
    }

}
