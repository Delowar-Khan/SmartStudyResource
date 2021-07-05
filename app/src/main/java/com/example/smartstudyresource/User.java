package com.example.smartstudyresource;

public class User {

    String u_id,u_email,u_name,u_password,u_phone,u_class,u_department;


    public User() {

    }

    public User(String u_id, String u_email, String u_name, String u_password, String u_phone, String u_class, String u_department) {
        this.u_id = u_id;
        this.u_email = u_email;
        this.u_name = u_name;
        this.u_password = u_password;
        this.u_phone = u_phone;
        this.u_class = u_class;
        this.u_department = u_department;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public String getU_class() {
        return u_class;
    }

    public void setU_class(String u_class) {
        this.u_class = u_class;
    }

    public String getU_department() {
        return u_department;
    }

    public void setU_department(String u_department) {
        this.u_department = u_department;
    }
}
