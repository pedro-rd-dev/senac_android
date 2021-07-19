package com.senac_android.models;

import com.orm.SugarRecord;

public class Usuario extends SugarRecord {
    private String userName;
    private String password;

    public Usuario() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
