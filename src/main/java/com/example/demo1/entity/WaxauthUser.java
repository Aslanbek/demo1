package com.example.demo1.entity;

import jakarta.persistence.*;
import java.util.List;

/**
 * this is comment for class
 */
@Entity
@Table(name = "Waxauth_User")

public class WaxauthUser extends BaseEntity {
    /**
     * name
     */
    @Column(name = "name")
    private String name; //todo Почему последовательность полей не соблюдается при создании?
    /**
     * pass
     */
    @Column(name = "passwd")
    private String passwd;
    /**
     * fio
     */
    @Column(name = "fullname")
    private String fullname;
    /**
     * blocked
     */
    @Column(name = "locked")
    private boolean locked;
    /**
     * user attrs
     */
    private List<WaxauthUserattrs> userAttrs;

    /**
     * def constructor
     */
    public WaxauthUser() {
    }

    /**
     * description
     *
     * @return attrs of user
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    public List<WaxauthUserattrs> getUserAttrs() {
        return userAttrs;
    }

    /**
     * descrion
     *
     * @param userAttrs list of attrs
     */
    public void setUserAttrs(List<WaxauthUserattrs> userAttrs) {
        this.userAttrs = userAttrs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
