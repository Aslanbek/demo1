package com.example.demo1.model;

import com.example.demo1.entity.WaxauthUserattrs;

/**
 * class model for entity WaxauthUserattrs
 */
public class WaxAuthUserAttrsModel extends BaseModel {
    private String name;
    private String value;

    private WaxAuthUserModel userModel;

    /**
     * default empty constr for class
     */
    public WaxAuthUserAttrsModel() {
    }

    /**
     * entity to model
     * @param entity WaxauthUserattrs
     * @return model WaxAuthUserAttrsModel
     */
    public static WaxAuthUserAttrsModel toModel(WaxauthUserattrs entity) {
        WaxAuthUserAttrsModel model = new WaxAuthUserAttrsModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.value = entity.getName();
        model.setUserModel(WaxAuthUserModel.toModel(entity.getWaxauthUser()));
        return model;
    }

    /**
     * set
     * @param name of attr
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set
     * @param value of WaxAuthUserAttrsModel
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * set
     * @param userModel own of attrs
     */
    public void setUserModel(WaxAuthUserModel userModel) {
        this.userModel = userModel;
    }
}