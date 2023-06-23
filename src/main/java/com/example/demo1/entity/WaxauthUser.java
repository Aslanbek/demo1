package com.example.demo1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * this is comment for class
 */
@Entity
@Table(name = "Waxauth_User")
@Getter
@Setter
@ToString
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
    private List<WaxauthUserattrs> waxauthUserattrsList;

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
    @OneToMany(mappedBy = "waxauthUser")
    public List<WaxauthUserattrs> getWaxauthUserattrsList() {
        return waxauthUserattrsList;
    }

    /**
     * descrion
     *
     * @param waxauthUserattrsList list of attrs
     */
    public void setWaxauthUserattrsList(List<WaxauthUserattrs> waxauthUserattrsList) {
        this.waxauthUserattrsList = waxauthUserattrsList;
    }
}
