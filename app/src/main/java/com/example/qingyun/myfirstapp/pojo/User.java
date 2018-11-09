package com.example.qingyun.myfirstapp.pojo;


public class User {
    private Integer id;

    private String username;

    private String password;

    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public int hashCode() {
        if (id == null) {
            id = 0;
        }
        if (username == null) {
            username = "";
        }
        return id + username.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        User u = (User) obj;
        return id.equals(u.id)&&username.equals(u.getUsername());
    }
}