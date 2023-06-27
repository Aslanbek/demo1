package com.example.demo1.service.impl;

import com.example.demo1.entity.WaxauthUser;
import com.example.demo1.exception.UserAlreadyExistException;
import com.example.demo1.exception.UserNotFoundException;
import com.example.demo1.model.WaxAuthUserModel;
import com.example.demo1.repository.WaxauthUserRepository;
import com.example.demo1.service.WaxauthUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * comments my coms
 */
@Slf4j
@Service
public class WaxauthUserServiceImpl implements WaxauthUserService {
    /**
     * injection
     */
    @Autowired
    private WaxauthUserRepository waxauthUserRepository;

    /**
     * def constr
     */
    public WaxauthUserServiceImpl() {
    }

    @Override
    public WaxAuthUserModel registration(WaxauthUser waxauthUser) throws UserAlreadyExistException {
        if (waxauthUserRepository.findByName(waxauthUser.getName()) != null) {
            throw new UserAlreadyExistException("user already exists");
        }
        return WaxAuthUserModel.toModel(waxauthUserRepository.save(waxauthUser));
    }

    @Override
    public WaxAuthUserModel getById(Long id) throws UserNotFoundException {
        Optional<WaxauthUser> waxauthUser = waxauthUserRepository.findById(id);
        if (waxauthUser.isEmpty()) {
            throw new UserNotFoundException("User Not Found");
        }
        return WaxAuthUserModel.toModel(waxauthUser.get());
    }

    @Override
    public void update(WaxauthUser waxauthUser) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<WaxAuthUserModel> getAll() {
        List<WaxauthUser> waxauthUserList = (List<WaxauthUser>) waxauthUserRepository.findAll();
        List<WaxAuthUserModel> userModelList =
        return null;
    }
}
