package com.example.demo1.service;

import com.example.demo1.entity.WaxauthUser;
import com.example.demo1.exception.UserAlreadyExistException;
import com.example.demo1.exception.UserNotFoundException;
import com.example.demo1.model.UserModel;

import java.util.List;

/**
 * description for class
 */
public interface UserService {
    /**
     * desciption
     *
     * @param waxauthUser entity
     * @return entity or error
     * @throws UserAlreadyExistException yes this is error
     */
    UserModel registration(WaxauthUser waxauthUser) throws UserAlreadyExistException;

    /**
     * descr
     * @param id paramy
     * @return my return
     * @throws UserNotFoundException my exception
     */
    UserModel getById(Long id) throws UserNotFoundException;

    /**
     * save my user
     *
     * @param waxauthUser entity
     */
    void update(WaxauthUser waxauthUser);

    /**
     * from db
     *
     * @param id by id
     */
    void delete(Long id);

    /**
     * description
     *
     * @return list of users
     */
    List<UserModel> getAll();
}
