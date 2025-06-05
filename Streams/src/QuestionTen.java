import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuestionTen {
    public static Map<String, Double> deptAvgSalary(List<Employee> empList) {

        return empList.stream().collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.averagingDouble(Employee::getSalary)));
    }
}
