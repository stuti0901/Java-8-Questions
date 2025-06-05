import java.util.List;
import java.util.stream.Collectors;

public class QuestionSeven {
    public static List<Employee> empLess30(List<Employee> empList)
    {
        return empList.stream().filter(emp->emp.getAge()<30).collect(Collectors.toList());
    }
}
