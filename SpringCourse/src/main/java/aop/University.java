package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Anton Krikov", 3, 10);
        Student st2 = new Student("Pasha Ivanov", 4, 3.9);
        Student st3 = new Student("Kesha Petrov", 2, 6.3);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Info about students");
        System.out.println(students);
        try {
            students.get(23);
        } catch (Exception e) {
            throw e;
        }
        return students;
    }

}
