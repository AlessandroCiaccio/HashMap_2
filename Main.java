import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> animals = Map.of(
                "Cat", "Persian",
                "Dog", "Labrador",
                "Hamster", "Syrian"
        );
        Set<String> values = new HashSet<>(animals.values());
        List<String> sortedValues=new ArrayList<>(values);
        sortedValues.sort(Comparator.naturalOrder());
        System.out.println(sortedValues);

    }
}
