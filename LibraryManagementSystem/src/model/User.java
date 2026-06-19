/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class User {

    private int userId;
    private String username;
    private String password;
    private String department;
    private String role;

    public User(int userId,
                String username,
                String password,
                String department,
                String role) {

        this.userId = userId;
        this.username = username;
        this.password = password;
        this.department = department;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }
}
