package com.example.demo1.service;

import com.example.demo1.entity.WaxauthUserattrs;
import com.example.demo1.model.WaxAuthUserAttrsModel;

import java.util.List;

/**
 * service interface for entity WaxAuthUserAttrs
 */
public interface WaxAuthUserAttrsService {

    List<WaxAuthUserAttrsModel> getAll();

    List<WaxAuthUserAttrsModel> getByUser(Long user_id);

    WaxAuthUserAttrsModel getById(Long id);

    void update(WaxauthUserattrs waxauthUserattrs);

    void delete(Long id);

    void deleteByUser(Long user_id);

}
