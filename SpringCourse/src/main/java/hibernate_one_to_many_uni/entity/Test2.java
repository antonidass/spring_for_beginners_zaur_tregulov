package hibernate_one_to_many_uni.entity;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
//            Department department = new Department("IT", 300, 100);
//            Employee emp = new Employee("Misha", "Volrov", "Sales", 140);
//            Employee em2 = new Employee("Elena", "Smirnova", "IT", 240);
//
//            department.addEmpToDep(emp);
//            department.addEmpToDep(em2);

            session.beginTransaction();
            Department department = session.get(Department.class, 1);
//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
//            System.out.println(department);
//            System.out.println(department.getEmps());

            System.out.println(department);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }
}
