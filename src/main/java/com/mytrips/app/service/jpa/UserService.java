package com.mytrips.app.service.jpa;

import com.mytrips.app.entity.UserEntity;
import com.mytrips.app.repository.UserRepository;
import com.mytrips.app.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepo;

    public List<UserEntity> buscarTodos(){
        return userRepo.findAll();
    }

    public Optional<UserEntity> findUser(String email, String password){
        return userRepo.findUser(email, password);
    }

    public UserEntity createUser(UserEntity user){
        userRepo.save(user);
        return user;
    }


}
