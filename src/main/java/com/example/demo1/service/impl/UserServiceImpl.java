package com.example.demo1.service.impl;

import com.example.demo1.entity.WaxauthUser;
import com.example.demo1.exception.UserAlreadyExistException;
import com.example.demo1.exception.UserNotFoundException;
import com.example.demo1.model.UserModel;
import com.example.demo1.repository.UserRepo;
import com.example.demo1.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * comments my coms
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    /**
     * injection
     */
    @Autowired
    private UserRepo userRepo;

    /**
     * def constr
     */
    public UserServiceImpl() {

    }

    @Override
    public UserModel registration(WaxauthUser waxauthUser) throws UserAlreadyExistException {
        if (userRepo.findByName(waxauthUser.getName()) != null) {
            throw new UserAlreadyExistException("user already exists");
        }
        return UserModel.toModel(userRepo.save(waxauthUser));
    }

    @Override
    public UserModel getById(Long id) throws UserNotFoundException {
        Optional<WaxauthUser> waxauthUser = userRepo.findById(id);
        if (waxauthUser.isEmpty()) {
            throw new UserNotFoundException("User Not Found");
        }
        return UserModel.toModel(waxauthUser.get());
    }

    @Override
    public void update(WaxauthUser waxauthUser) {
        userRepo.save(waxauthUser);
    }

    @Override
    public void delete(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<UserModel> getAll() {
        List<WaxauthUser> userList = (List<WaxauthUser>) userRepo.findAll();
        List<UserModel> userModelList = new ArrayList<>();
        for (WaxauthUser user : userList) {
            userModelList.add(UserModel.toModel(user));
        }
        return userModelList;
    }
}
