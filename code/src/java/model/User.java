package model;

import utils.MD5;

import java.util.regex.Pattern;

public class User {

    private String userName, fullName, gender, email, avatar, description;
    private int uid, age, status,userRight;

    public User() {
    }

    public User(String userName, String fullName, String gender, 
            String email, String avatar, String description, int uid, int age, int status,int userRight) {
        this.userName = userName;
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
        this.avatar = avatar;
        this.description = description;
        this.uid = uid;
        this.age = age;
        this.status = status;
        this.userRight = userRight;
    }

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uID) {
        this.uid = uID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserRight() {
        return userRight;
    }

    public void setUserRight(int userRight) {
        this.userRight = userRight;
    }
    
    
}