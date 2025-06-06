import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringWithSpecificLetter {
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("apple", "banana", "apricot");
        long count= words.stream().filter(w->w.startsWith("a")).count(); //Why long? bcoz count() method return long
        System.out.println(count);
    }
}
