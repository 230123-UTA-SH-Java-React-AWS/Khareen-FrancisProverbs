package com.revature.model;

/*
    Model layer is responsible for hold stateful objects
    objects that have information that differs from another object from the same class
*/

public class Employee {

  //Uniquely identifiable field that is numeric
  private int empID;

  //Fields that will be useful to uniquely identify this object
  private String empName;
  private String email;
  private String passwd;

  //What data structure allows us to add multiple things
  //private List<Ability> abilities;

  public Employee() {
    // this.abilities = new ArrayList<>();
  }

  //right click, click source action, click generate getters and setters, select all fields, hit ok
  public int getemployeeID() {
    return empID;
  }

  public void setemployeeID(int employeeID) {
    this.empID = employeeID;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }
  //     public List<Ability> getAbilities() {
  //         return abilities;
  //     }

  //     public void setAbilities(List<Ability> abilities) {
  //         this.abilities = abilities;
  //     }
}
