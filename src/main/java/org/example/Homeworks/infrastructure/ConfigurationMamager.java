package org.example.Homeworks.infrastructure;

public class ConfigurationMamager {
    public static String getEnvironmentVariableOrDefault(String envVar, String defaultValue) {
        return System.getenv(envVar)==null  ?
                defaultValue :
                System.getenv(envVar);
    }
}
