package hibernate2.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String depName;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "min_salary")
    private int minSalary;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dep", fetch = FetchType.EAGER)
    private List<Employee> emps;

    public List<Employee> getEmps() {
        return emps;
    }

    public void addEmpToDep(Employee employee) {
        if (emps == null) {
            emps = new ArrayList<>();
        }

        emps.add(employee);
        employee.setDep(this);
    }



    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public Department(String depName, int maxSalary, int minSalary) {
        this.depName = depName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", depName='" + depName + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                '}';
    }
}
