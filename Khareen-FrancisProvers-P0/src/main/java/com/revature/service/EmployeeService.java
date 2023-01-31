package com.revature.service;

import com.revature.model.Employee;
import com.revature.repository.EmployeeRepository;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

    /*The service layer is responsible for hold behavior driven classes
    It might have further validation or information process within the service
*/
public class EmployeeService {

  public void save(String empJson) {
    EmployeeRepository repo = new EmployeeRepository();
    //Conversion from string to Employee obj here?
    ObjectMapper mapper = new ObjectMapper();

    try {
      //readvale not workng
      Employee newEmployee = mapper.readValue(empJson, Employee.class);

      repo.Save(newEmployee);
    } catch (JsonParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (JsonMappingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void findEmployee() {}
}
