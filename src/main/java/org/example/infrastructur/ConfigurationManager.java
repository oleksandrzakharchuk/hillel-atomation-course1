package org.example.infrastructur;

public class ConfigurationManager {
    private static org.example.infrastructure.ConfigurationManager instance;
    //public int getLogType;

    private ConfigurationManager() {
    }
    public static org.example.infrastructure.ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new org.example.infrastructure.ConfigurationManager();
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

