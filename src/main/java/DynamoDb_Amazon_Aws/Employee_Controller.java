package DynamoDb_Amazon_Aws;

import com.amazonaws.services.dynamodbv2.xspec.S;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Employee_Controller {

    @Autowired
    private Employee_Repo employee_repo;

    @PostMapping("/saveAEmployee")
    public Employee saveAEmployee(@RequestBody Employee employee){
        return employee_repo.save(employee);
    }

    @GetMapping("/getAEmployeeById/{empId}")
    public Employee getEmployee(@PathVariable String empId){
        return employee_repo.getEmployee(empId);
    }

    @PostMapping("/updateAEmployee/{empId}")
    public String upDateAEmployee(@RequestBody Employee employee, @PathVariable String empId){
        return employee_repo.updateEmployee(empId,employee);
    }

    @DeleteMapping("/deleteAEmployee/{id}")
    public String deleteAEmployee(@PathVariable String id){
        return employee_repo.deleteEmployee(id);
    }

}
