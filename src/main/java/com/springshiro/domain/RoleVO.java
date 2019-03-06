/**
 * Author:
 * Date:     2019/2/15 12:14
 * Description:
 */
package com.springshiro.domain;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable{
    
    private Long id;
    private String roleName;
    private User user;
    private List<Permission> permissions;

    public Role(Long id, String roleName, User user, List<Permission> permissions) {
        this.id = id;
        this.roleName = roleName;
        this.user = user;
        this.permissions = permissions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
