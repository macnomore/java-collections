import java.util.*;

public class Collections {
    public static void main(String[] args) {
        char characterVal = '`';

        // Provides an ordered collection that stores duplicates
        List<String> stringValues = new ArrayList<>();

        // Provides a collection that stores key-value pairs
        Map<Integer, String> mapValues = new HashMap<>();

        // Provides an unorderd collection that saves unique values without duplicates
        Set<String> setValues = new HashSet<>();

        for (int i = 1; i < 10; i++) {
            characterVal++;

            stringValues.add("Number: " + i);

            mapValues.put(i, "value_" + String.valueOf(characterVal));

            setValues.add("Number: " + i);
        }

        System.out.println();
        System.out.println("List Collection:");
        System.out.println(stringValues);
        System.out.println();
        System.out.println("Map Collection:");
        System.out.println(mapValues);
        System.out.println();
        System.out.println("Set Collection:");
        System.out.println(setValues);
        System.out.println();

    }
}
