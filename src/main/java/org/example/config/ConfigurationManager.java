package org.example.config;

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

    public String getJdbcConnectionUrl(){
        return getEnvironmentVariableOrDefault("JDBC CONNECTION URL","database.sqlite");
    }

    String getEnvironmentVariableOrDefault(String envVar, String defaultVole) {
        return System.getenv(envVar) == null || System.getenv(envVar).isBlank() ?
                defaultVole :
                System.getenv(envVar);
    }
}

