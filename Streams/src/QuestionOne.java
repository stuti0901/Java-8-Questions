import java.util.List;
import java.util.stream.Collectors;

public class QuestionOne {
    public static  List<Employee> getEmployeesStartingWithA(List<Employee> empList)
{
        return empList.stream()
            .filter(emp -> emp.getName().startsWith("A"))
            .collect(Collectors.toList());
}
}