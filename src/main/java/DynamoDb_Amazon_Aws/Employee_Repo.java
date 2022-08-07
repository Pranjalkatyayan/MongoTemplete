package DynamoDb_Amazon_Aws;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodbv2.xspec.S;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Employee_Repo {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Employee save(Employee employee){
        dynamoDBMapper.save(employee);
        return employee;
    }

    public Employee getEmployee(String employeeId){
        return dynamoDBMapper.load(Employee.class,employeeId);
    }

    public String deleteEmployee(String employeeId){
        Employee employee=dynamoDBMapper.load(Employee.class,employeeId);
        dynamoDBMapper.delete(employee);
        return "Employee Deleted with Employee Id " + employeeId;

    }

    public String updateEmployee(String employeeId,Employee employee){
        dynamoDBMapper.save(employee,
                                 new DynamoDBSaveExpression().withExpectedEntry("StudentId",
                                         new ExpectedAttributeValue(new AttributeValue().withS(employeeId)
                                         )));

        return employeeId;
    }
}
