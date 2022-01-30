package hibernate2;

import hibernate2.entity.Detail;
import hibernate2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class  Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Employee emp = new Employee("Oleg", "Volrov", "Sales", 240);
//            Detail detail = new Detail("Coscow", "djjddjxxsaf", "aa@ama.ru");
//            emp.setEmpDetail(detail);


            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }





    }
}
