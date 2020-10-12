package org.example.infrastructure;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    //public int getLogType;

    private ConfigurationManager() {
    }
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }


    public String getTestBrowser() {
        return getEnvironmentVariableOrDefault("testBrowser", "chrome");
    }

    public String getTestEnv() {
        return getEnvironmentVariableOrDefault("testEnv", "production");
    }

    String getEnvironmentVariableOrDefault(String envVar, String defaultVole) {
        return System.getenv(envVar) == null || System.getenv(envVar).isBlank() ?
                defaultVole :
                System.getenv(envVar);
    }
}