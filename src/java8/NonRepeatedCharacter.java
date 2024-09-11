package java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ns.collection.Map;


public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "swiss";

        Character result = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);

        System.out.println("First non-repeated character is: " + result);
    }
}

