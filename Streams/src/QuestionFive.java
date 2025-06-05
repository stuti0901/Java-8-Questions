import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuestionFive {
    public static List<String> deptName(List<Employee> empList) {
        return empList.stream().map(emp -> emp.getDepartNames()).collect(Collectors.toList());
    }
}
