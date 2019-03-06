/**
 * Author:
 * Date:     2019/2/15 12:13
 * Description:
 */
package com.springshiro.domain;

import java.util.List;

public class User {

    private Long id;
    private String name;
    private Integer password;
    private List<Role> roles;

    public User(Long id, String name, Integer password, List<Role> roles) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}
