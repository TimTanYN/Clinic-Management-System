/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author haoyi
 */
public class Staff{
    
    private String id;
    private String name;
    private String age;
    private String role;
    private String DateOfBirth;
    private String salary;
    private String email;

    public Staff(String id, String name, String age, String role, String DateOfBirth, String salary, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
        this.DateOfBirth = DateOfBirth;
        this.salary = salary;
        this.email = email;
    }
    
    public Staff(String id) {
        this.id = id;
    }
    
    public Staff() {
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
    
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
