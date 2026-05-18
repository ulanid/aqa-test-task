package com.qa.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JsonDataReader {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private JsonDataReader() {}

    public static <T> T load(String classpathResource, Class<T> type) {
        try (InputStream in = JsonDataReader.class.getClassLoader()
                .getResourceAsStream(classpathResource)) {
            if (in == null) {
                throw new IllegalArgumentException("File not found: " + classpathResource);
            }
            return MAPPER.readValue(in, type);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read: " + classpathResource, e);
        }
    }
}