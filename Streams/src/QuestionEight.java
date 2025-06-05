import java.util.List;
import java.util.stream.Collectors;

public class QuestionEight {
    public static List<Employee> ageBetween26and30(List<Employee> empList)
    {
        return empList.stream().filter(emp->emp.getAge()>26 && emp.getAge()<30).collect(Collectors.toList());
    }
}
