package hibernate;

import hibernate2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {


    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            List<Employee> emps = session.createQuery("from Employee " +
                    "where salary = 500 AND surname != 'Krikov'")
                    .getResultList();

            session.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }
    }
}
