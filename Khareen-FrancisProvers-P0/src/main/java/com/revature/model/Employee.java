package com.revature.model;

import java.util.ArrayList;
import java.util.List;

/*
    Model layer is responsible for hold stateful objects
    objects that have information that differs from another object from the same class
*/

public class Employee {

  //Uniquely identifiable field that is numeric
  private int employeeID;

  //Fields that will be useful to uniquely identify this object
  private String name;
  private String email;
  private String password;

  //What data structure allows us to add multiple things
  //private List<Ability> abilities;

  public Employee() {
    // this.abilities = new ArrayList<>();
  }

  //right click, click source action, click generate getters and setters, select all fields, hit ok
  public int getemployeeID() {
    return employeeID;
  }

  public void setemployeeID(int employeeID) {
    this.employeeID = employeeID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  //     public List<Ability> getAbilities() {
  //         return abilities;
  //     }

  //     public void setAbilities(List<Ability> abilities) {
  //         this.abilities = abilities;
  //     }
}
