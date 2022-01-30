package org.example;

import org.example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {
    @Autowired
    private RestTemplate restTemplate;

    private final String URL = "http://localhost:8080/api/employees";
    private final String URL2 = "http://localhost:8080/api/emps";


    public List<Employee> showAllEmps() {
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(URL2,
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Employee>>() {});

        return responseEntity.getBody();
    }

    public Employee getEmp(int id) {
        return null;
    }

    public void saveEmployee(Employee employee) {
        return;
    }

    public void deleteEmployee(int id) {

    }
}
