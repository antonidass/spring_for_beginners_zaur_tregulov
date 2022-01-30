package hibernate;

import hibernate2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session;
        try {
//            session = factory.getCurrentSession();
//            Employee emp = new Employee("Elena", "Petrova", "Sales", 340);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1);
            session.getTransaction().commit();
            System.out.println("HERE" + employee);


        } finally {
            factory.close();
        }





    }
}
