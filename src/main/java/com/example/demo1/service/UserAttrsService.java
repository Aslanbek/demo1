package com.example.demo1.service;

import com.example.demo1.entity.WaxauthUserattrs;
import com.example.demo1.model.UserAttrsModel;

import java.util.List;

/**
 * service interface for entity WaxAuthUserAttrs
 */
public interface UserAttrsService {

    WaxauthUserattrs createAttr(WaxauthUserattrs waxauthUserattrs, Long userId) throws Exception;

    List<UserAttrsModel> getAll();

    List<UserAttrsModel> getByUser(Long user_id);

    UserAttrsModel getById(Long id) throws Exception;

    WaxauthUserattrs update(WaxauthUserattrs waxauthUserattrs) throws Exception;

    void delete(Long id);

    void deleteByUser(Long user_id);

}
