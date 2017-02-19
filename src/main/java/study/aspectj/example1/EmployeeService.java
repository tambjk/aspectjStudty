package study.aspectj.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Erman-PC-G on 18.02.2017.
 */
public class EmployeeService {
    public List<String> getAllEmployees(String status){
        return new ArrayList<String>(Arrays.asList("Erman"));
    }
}
