package com.example.demo1.model;

import com.example.demo1.entity.WaxauthUser;

/**
 * model for entity @class
 */
public class WaxAuthUserModel extends BaseModel {
    private String name;
    private String fullname;
    private boolean locked;

    /**
     * comment
     *
     * @param entity my entity
     * @return my model
     */
    public static WaxAuthUserModel toModel(WaxauthUser entity) {
        WaxAuthUserModel model = new WaxAuthUserModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setFullname(entity.getFullname());
        model.setLocked(entity.isLocked());
        return model;
    }

    /**
     * def constr
     */
    public WaxAuthUserModel() {

    }

    /**
     * descr
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * descr
     *
     * @param name set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * descr
     *
     * @return fio
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * descr
     *
     * @param fullname set fio
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * descr
     *
     * @return zablok
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * descr
     *
     * @param locked bollean params
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    /**
     * descr
     *
     * @return id
     */
    public String toString() {
        return "WaxAuthUserModel{" +
                "id=" + super.getId() +
                '}';
    }
}
