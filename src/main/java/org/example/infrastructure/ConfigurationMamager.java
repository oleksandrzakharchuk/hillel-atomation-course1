package org.example.infrastructure;

public class ConfigurationMamager {
    private static ConfigurationMamager instance;

    private ConfigurationMamager() {

    }

    private static ConfigurationMamager getInstance() {
        if (instance == null) {
            instance = new ConfigurationMamager();
        }
        return instance;
    }

    public String getTestBrowser() {
        return getEnvironmentVariableOrDefault("testBrowser", "chrome");

    }

    public String getTestEnv() {
        return getEnvironmentVariableOrDefault("testEnv", "production");
    }

    String getEnvironmentVariableOrDefault(String envVar, String defoultVolue) {
        return System.getenv(envVar) == null || System.getenv(envVar).isBlank() ?
                defoultVolue :
                System.getenv(envVar);
    }
}

