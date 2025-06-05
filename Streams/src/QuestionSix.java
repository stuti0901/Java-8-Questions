import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuestionSix {
    public static Map<String, Long> countEmpDepart(List<Employee> empList)
    {
        return empList.stream().collect(Collectors.groupingBy(Employee::getDepartNames,Collectors.counting()));
    }
}
