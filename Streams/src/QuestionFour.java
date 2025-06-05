import java.util.List;

public class QuestionFour {
    public static int maxAge(List<Employee> empList)
    {
        return empList.stream().mapToInt(emp->emp.getAge()).max().getAsInt();
    }
}
