/**
 * Author:
 * Date:     2019/2/15 12:15
 * Description:
 */
package com.springshiro.domain;

public class Permission {
    private Long id;
    private String permission;
    private Role role;

    public Permission(Long id, String permission, Role role) {
        this.id = id;
        this.permission = permission;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
