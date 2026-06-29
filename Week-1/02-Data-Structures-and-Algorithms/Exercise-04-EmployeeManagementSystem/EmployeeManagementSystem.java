public class EmployeeManagementSystem {

    Employee[] employees = new Employee[10];
    int count = 0;

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        }
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id)
                return employees[i];
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                break;
            }
        }
    }

    public static void main(String[] args) {

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.addEmployee(new Employee(101, "Alice", "Manager", 75000));
        ems.addEmployee(new Employee(102, "Bob", "Developer", 60000));
        ems.addEmployee(new Employee(103, "Charlie", "Tester", 50000));

        System.out.println("Employees:");

        ems.traverseEmployees();

        System.out.println("\nSearch:");

        System.out.println(ems.searchEmployee(102));

        ems.deleteEmployee(102);

        System.out.println("\nAfter Delete:");

        ems.traverseEmployees();
    }
}