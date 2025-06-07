
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacterInString {
    public static void main(String[] args) {
        String name = "awasthi";

        Map<Character, Long> collect = name.chars().mapToObj(ch -> (char) ch).
                collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(collect);
    }
}