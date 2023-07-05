package com.example.demo1.service.impl;

import com.example.demo1.entity.WaxauthUser;
import com.example.demo1.entity.WaxauthUserattrs;
import com.example.demo1.model.UserAttrsModel;
import com.example.demo1.repository.UserAttrsRepo;
import com.example.demo1.repository.UserRepo;
import com.example.demo1.service.UserAttrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserAttrsServiceImpl implements UserAttrsService {
    @Autowired
    private UserAttrsRepo attrsRepo;
    @Autowired
    private UserRepo userRepo;

    @Override
    public WaxauthUserattrs createAttr(WaxauthUserattrs userAttrs, Long userId) throws Exception {
        WaxauthUser user = userRepo.findById(userId).get();
        userAttrs.setUser(user);
        return attrsRepo.save(userAttrs);
    }

    @Override
    public List<UserAttrsModel> getAll() {
        List<WaxauthUserattrs> attrs = (List<WaxauthUserattrs>) attrsRepo.findAll();
        List<UserAttrsModel> attrsModelList = new ArrayList<>();
        for (WaxauthUserattrs attr : attrs) {
            attrsModelList.add(UserAttrsModel.toModel(attr));
        }
        return attrsModelList;
    }

    @Override
    public List<UserAttrsModel> getByUser(Long user_id) {
        // List<WaxauthUserattrs> waxauthUserattrsList = waxAuthUserAttrsRepository.findByWaxauthUser(user_id);
        List<UserAttrsModel> modelList = new ArrayList<>();
/*        for (WaxauthUserattrs v : waxauthUserattrsList) {
            modelList.add(WaxAuthUserAttrsModel.toModel(v));
        }*/
        return modelList;
    }

    @Override
    public UserAttrsModel getById(Long id) throws Exception {
        return UserAttrsModel.toModel(attrsRepo.findById(id).get());
    }

    @Override
    public WaxauthUserattrs update(WaxauthUserattrs waxauthUserattrs) throws Exception {
        Optional<WaxauthUserattrs> optionalWaxauthUserattrs = attrsRepo.findById(waxauthUserattrs.getId());
        if (optionalWaxauthUserattrs.isEmpty()) {
            throw new Exception("attr not found");
        } else {
            return attrsRepo.save(waxauthUserattrs);
        }
    }

    @Override
    public void delete(Long id) {
        attrsRepo.deleteById(id);
    }

    @Override
    public void deleteByUser(Long user_id) {

    }
}
