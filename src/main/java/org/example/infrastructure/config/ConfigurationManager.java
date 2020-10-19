package org.example.infrastructure.config;

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

public String getRunOn(){
        return getEnvironmentVariableOrDefault("ruOn","local");
}

    public String getTestBrowser() {

        return getEnvironmentVariableOrDefault("testBrowser", "chrome");
    }

    public String getTestEnv() {

        return getEnvironmentVariableOrDefault("testEnv", "production");
    }

    public String getLogType(){
        return getEnvironmentVariableOrDefault("logType", "std");
    }

    public String getMobilePlatform(){
        return getEnvironmentVariableOrDefault("mobilePlatform", "");
    }

    String getEnvironmentVariableOrDefault(String envVar, String defaultVole) {
        return System.getenv(envVar) == null || System.getenv(envVar).isBlank() ?
                defaultVole :
                System.getenv(envVar);
    }
}

