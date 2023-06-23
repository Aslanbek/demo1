package com.example.demo1.repository;

import com.example.demo1.entity.WaxauthUser;
import org.springframework.data.repository.CrudRepository;

/**
 * comments
 */
public interface WaxauthUserRepository extends CrudRepository<WaxauthUser, Long> {
    /**
     * desc
     * @param name name of WaxauthUser
     * @return entity
     */
    WaxauthUser findByName(String name);
}
