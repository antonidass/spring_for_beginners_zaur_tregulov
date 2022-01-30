package com.example.springboot.dao;

import com.example.springboot.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Repository
public class EmployeeDaoImplementation implements EmployeeDao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
//        Session session = entityManager.unwrap(Session.class);
//
//        Query<Employee> query = session.createQuery("from Employee", Employee.class);
//        List<Employee> allEmps = query.getResultList();
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmps = query.getResultList();
        return allEmps;
    }

    @Override
    public void saveEmployee(Employee employee) {
//        Session session = entityManager.unwrap(Session.class);
      Employee newEmp =   entityManager.merge(employee);
      employee.setId(newEmp.getId());
//        session.saveOrUpdate(employee);
    }


    @Override
    public Employee getEmployeeById(int id) {
//        Session session = entityManager.unwrap(Session.class);
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void deleteEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);

        entityManager.remove(entityManager.find(Employee.class, id));
//        session.delete(session.get(Employee.class, id));
    }
}
