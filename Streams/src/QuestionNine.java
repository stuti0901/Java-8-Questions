import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuestionNine {
    public static Map<String,Double> averageAge(List<Employee> empList)
    {
        return empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
    }
}
