import javax.lang.model.element.Name;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuestionTwo {
    public static Map<String, List<Employee>> departmentByName(List<Employee> empList)
    {
        return empList.stream().collect(Collectors.groupingBy(Employee::getDepartNames));
    }
}
//employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames));