package com.example.demo1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * this is comment for class
 */
@Entity
@Table(name = "Waxauth_Userattrs")
@Getter
@Setter
@ToString
public class WaxauthUserattrs extends BaseEntity {

    private String name;
    private WaxauthUser user;

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

}
