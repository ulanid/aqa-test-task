package com.qa;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
public class DuplicateCounterTest {

    @Test
    public void testBasicDuplicates() {
        List<String> input = List.of("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> result = DuplicateCounter.countDuplicates(input);

        assertEquals(2, result.size());
        assertEquals(3L, result.get("apple"));
        assertEquals(2L, result.get("banana"));
        assertFalse(result.containsKey("cherry"));
    }

    @Test
    public void testNoDuplicates() {
        List<String> input = List.of("alpha", "beta", "gamma");
        Map<String, Long> result = DuplicateCounter.countDuplicates(input);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testEmptyList() {
        Map<String, Long> result = DuplicateCounter.countDuplicates(List.of());
        assertTrue(result.isEmpty());
    }

    @Test
    public void testNullInput() {
        Map<String, Long> result = DuplicateCounter.countDuplicates(null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAllSameStrings() {
        List<String> input = List.of("x", "x", "x", "x");
        Map<String, Long> result = DuplicateCounter.countDuplicates(input);
        assertEquals(1, result.size());
        assertEquals(4L, result.get("x"));
    }
}