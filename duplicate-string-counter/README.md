# Part 3: Duplicate String Counter

## Objective: Write a function that takes a list of strings, finds all duplicates and returns them with their occurrence count.

## Usage

```java
List<String> input = List.of("apple", "banana", "apple", "cherry", "banana");

Map<String, Long> duplicates = DuplicateCounter.countDuplicates(input);

// Result: {apple=2, banana=2}
```

## How to run tests

```bash
mvn test
```

## Why Streams?

I used Java Streams with `Collectors.groupingBy` and `Collectors.counting()` because:
- it's more readable than a manual `for` loop
- it goes through the list only once and is faster than using `Collections.frequency` in a loop which would check every element multiple times

## Edge cases

- No Duplicates = returns empty map
- `null` input = returns empty map
- Empty list = returns empty map
- All same strings = returns that string with full count
