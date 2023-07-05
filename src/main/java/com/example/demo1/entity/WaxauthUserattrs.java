package com.example.demo1.entity;

import jakarta.persistence.*;

/**
 * this is comment for class
 */
@Entity
@Table(name = "Waxauth_Userattrs")
public class WaxauthUserattrs extends BaseEntity {
    /**
     * name
     */
    @Column(name = "name")
    private String name;
    /**
     * user from waxauthuser
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private WaxauthUser user;
    /**
     *
     */
    @Column(name = "value")
    private String value;

    /**
     * comments
     */
    public WaxauthUserattrs() {
    }

    /**
     * descrip
     *
     * @return entity user
     */
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_waxauth_user_id"))
    public WaxauthUser getUser() {
        return user;
    }

    /**
     * description
     *
     * @param waxauthUser entity user
     */
    public void setUser(WaxauthUser waxauthUser) {
        this.user = waxauthUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
