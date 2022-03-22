package com.entity;

public class Account {
    private int id;
    private String username;
    private int departmentId;

    public Account(int id, String username, int departmentId) {
        this.id = id;
        this.username = username;
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
