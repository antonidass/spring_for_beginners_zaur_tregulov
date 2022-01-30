package hibernate2;

import hibernate2.entity.Department;
import hibernate2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLOutput;

public class Test2 {


    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

            Department department = new Department("Sales", 3300, 100);
            Employee emp = new Employee("Ivan", "Volrov", "Sales", 1340);
            Employee em2 = new Employee("Keladsdlena", "Smirnova", "IT", 2340);
            Employee em3 = new Employee("Zeladsdlena", "Smirnova", "IT", 2340);

            department.addEmpToDep(emp);
            department.addEmpToDep(em2);
            department.addEmpToDep(em3);

            session.beginTransaction();
//            session.save(department);
            System.out.println("Get department");
            Department department1 = session.get(Department.class, 3);
            System.out.println(department1);
            System.out.println("Show employeeesss!");
            System.out.println(department1.getEmps());


            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
