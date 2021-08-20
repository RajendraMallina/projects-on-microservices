package io.javabrains.moviecatalogservice.model;

public class User {

    private String userId;
    private String userName;
    private String gender;
    private int age;

    public User(){}

    public User(String userId, String userName, String gender, int age) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
