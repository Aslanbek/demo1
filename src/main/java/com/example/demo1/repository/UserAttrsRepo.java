package com.example.demo1.repository;

import com.example.demo1.entity.WaxauthUserattrs;
import org.springframework.data.repository.CrudRepository;

/**
 * my repo class
 */
public interface UserAttrsRepo extends CrudRepository<WaxauthUserattrs, Long> {

}
