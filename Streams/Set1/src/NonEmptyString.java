import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NonEmptyString {
    public  static void main(String args[])
    {
        List<String> list = Arrays.asList("", "", "hello", "world");
        Optional<String> firstNonEmpty = list.stream().filter(s->!s.isEmpty()).findFirst();
        System.out.println(firstNonEmpty.orElse("Not found")); // hello

    }
}
