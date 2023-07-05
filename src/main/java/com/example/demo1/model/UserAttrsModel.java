package com.example.demo1.model;

import com.example.demo1.entity.WaxauthUserattrs;

/**
 * class model for entity WaxauthUserattrs
 */
public class UserAttrsModel extends BaseModel {
    private String name;
    private String value;

    private UserModel userModel;

    /**
     * default empty constr for class
     */
    public UserAttrsModel() {
    }

    /**
     * entity to model
     *
     * @param entity WaxauthUserattrs
     * @return model WaxAuthUserAttrsModel
     */
    public static UserAttrsModel toModel(WaxauthUserattrs entity) {
        UserAttrsModel model = new UserAttrsModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setValue(entity.getValue());
        return model;
    }

    /**
     * set
     *
     * @param name of attr
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set
     *
     * @param value of WaxAuthUserAttrsModel
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * set
     *
     * @param userModel own of attrs
     */
    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}