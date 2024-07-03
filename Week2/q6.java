package Week2;

import java.util.ArrayList;

class Employee{
    private final int id;
    private final String name;
    private final String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

class EmployeeCRUD {
    private final ArrayList<Employee> employees = new ArrayList<>();

    public void createEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Created employee: " + employee);
    }

    public ArrayList<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for(Employee employee: employees) {
            if(employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void updateEmployee(Employee employee) {
        int index = -1;
        for(int i = 0; i < employees.size(); ++i) {
            if(employees.get(i).getId() == employee.getId()) {
                index = i;
                break;
            }
        }

        if(index != -1) {
            employees.set(index, employee);
            System.out.println("Updated employee: " + employee);
        }
        else
            System.out.println("Employee with given id does not exist!");
    }

    public void deleteEmployee(int id) {
        if(employees.removeIf(employee -> employee.getId() == id))
            System.out.println("Deleted employee with the given id");
        else
            System.out.println("Employee with given id does not exist!");
    }
}

public class q6 {
    public static void main(String[] args) {
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();

        employeeCRUD.createEmployee(new Employee(1, "Anuraag", "Computer"));

        employeeCRUD.createEmployee(new Employee(2, "Ganji", "Science"));

        System.out.println("getAllEmployees: " + employeeCRUD.getAllEmployees());

        System.out.println("getEmployeeById: " + employeeCRUD.getEmployeeById(1));

        employeeCRUD.updateEmployee(new Employee(1, "xehtist", "Computer"));
        System.out.println("After updating: " + employeeCRUD.getAllEmployees());

        employeeCRUD.deleteEmployee(1);
        System.out.println("After deleting " + employeeCRUD.getAllEmployees());
    }
}
