package com.qa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCounter {

    public static Map<String, Long> countDuplicates(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return new HashMap<>();
        }

        return strings.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static void main(String[] args) {
        List<String> input = List.of(
                "apple", "banana", "apple", "cherry",
                "banana", "apple", "date", "cherry"
        );

        Map<String, Long> duplicates = countDuplicates(input);

        System.out.println("Duplicate strings found:");
        duplicates.forEach((word, count) ->
                System.out.printf("  %-10s -> %d occurrences%n", word, count)
        );
    }
}