package com.revature.repository;

import com.revature.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.revature.utils.ConnectionUtil;

/*
    Repository layer is responsible for interacting with a database and sending/receiving information from the database
*/
public class EmployeeRepository {

  //Create a method in EmployeeRepository that allows you to store in a file locally in your computer
  public void Save(Employee employee) {
    //NEW WAY TO SAVE TO DATABASE INSTEAD
    String sql = "insert into employee (empID, empName, email, passwd) values (?, ?, ?, ?)";

    try (Connection con = ConnectionUtil.getConnection()) {

      PreparedStatement prstmt = con.prepareStatement(sql);

      //We are replacing the '?' into actual values from the pokemon we received
      //Sadly, it uses one-based indexing so 1 is the very first parameter
      prstmt.setString(1, employee.getEmpName());
      prstmt.setInt(2, employee.getemployeeID());
      prstmt.setString(3, employee.getEmail());
      prstmt.setString(4, employee.getPasswd());

      //execute() method does not expect to return anything from the statement
      //executeQuery() method does expect something to result after executing the statement
      prstmt.execute();

    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }
  }

  }
  //Old implementation
//    //Actual implementation here
//    ObjectMapper mapper = new ObjectMapper();
//    String jsonObject = "";
//
//    try {
//      //Converted the Employee obj into json
//      jsonObject = mapper.writeValueAsString(employee);
//
//      //Save the json into a file
//      //File constructor needs a string that holds the path of where you want to save the file
//      File empFile = new File(
//        "./src/main/java/com/revature/repository/employee.json"
//      );
//      empFile.createNewFile();
//
//      //Writing the file
//      FileWriter writer = new FileWriter(
//        "./src/main/java/com/revature/repository/employee.json"
//      );
//      writer.write(jsonObject); //Writes the string into the file
//      writer.close(); //Closes the necessary resources associated with a filewriter object
//    } catch (JsonGenerationException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    } catch (JsonMappingException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//  }

