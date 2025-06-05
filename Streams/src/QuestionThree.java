import java.util.List;

public class QuestionThree {
    public static long  countemp(List<Employee> empList)
    {
        return empList.stream().count();
    }
}
