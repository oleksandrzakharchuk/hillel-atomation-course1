package org.example.infrastructure;

public class TestServer {
    public static String GetUrl() {

        switch(ConfigurationMamager.getInstanse().getTestEnv();){
            case "dev":
                return "http://dev.mysite.com";
            case "staging":
                return "http://staging.mysite.com";
            case "test":
                return "http://test/mysite.com";
            case "production":
            default:
                return "http://mysite.com";

        }

    }
}
