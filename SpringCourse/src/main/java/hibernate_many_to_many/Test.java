package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {


    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
//
//            Section section = new Section("Skateeball");
//            Section section2 = new Section("Pasball");
//            Section sectio3 = new Section("Chess");
//
//            Child child1 = new Child(4, "Antonio");
//            child1.addSectionToChild(section);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(sectio3);
//            Child child2 = new Child(5, "Zntonio");
//            Child child3 = new Child(7, "Kntonio");
//            Child child4 = new Child(6, "Cntonio");
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//            section.addChildToSection(child4);

            session.beginTransaction();
//            Child child = session.get(Child.class, 1);
//            System.out.println(child.getSections());
            session.delete(session.get(Section.class, 1));

//            session.save(child1);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }
}
