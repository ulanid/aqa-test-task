package com.qa.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    private static AppConfig instance;
    private final Properties props = new Properties();

    private AppConfig() {
        try (InputStream in = getClass().getClassLoader()
                .getResourceAsStream("config.properties")) {
            if (in == null) {
                throw new IllegalStateException("config.properties not found");
            }
            props.load(in);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to load config.properties", e);
        }
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getBrowser() { return props.getProperty("browser", "chrome"); }
    public boolean isHeadless() { return Boolean.parseBoolean(props.getProperty("headless", "false")); }
    public String getBaseUrl() { return props.getProperty("base.url"); }
    public long getTimeout() { return Long.parseLong(props.getProperty("timeout.ms", "8000")); }
    public long getPageLoadTimeout() { return Long.parseLong(props.getProperty("page.load.timeout.ms", "15000")); }
}