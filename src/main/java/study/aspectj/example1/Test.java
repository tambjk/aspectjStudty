package study.aspectj.example1;

/**
 * Created by Erman-PC-G on 18.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        System.out.println(employeeService.getAllEmployees("active"));
    }
}
