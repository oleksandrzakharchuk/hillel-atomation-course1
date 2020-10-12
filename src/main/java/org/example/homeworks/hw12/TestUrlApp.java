package org.example.homeworks.hw12;

import org.example.infrastructure.TestUrl;

public class TestUrlApp {
    public static void main(String[] args) {

        String localDev = new Bilder()
                .withProtocol("https")
                .withDomain("localhost")
                .withPort("8080")
                .withPath("/user")
                .withbuild();//https://localhost:8080/users

        String testEnv = new TestUrlApp.Builder()
                .withProtocol("https")
                .withDomain("test.mysite.com")
                .withPath("/user")
                .withParm("debug", "true")
                .withParm("disableConfirm")
                .withParam("exp", "abTestQa")
                .withbuild();//https://test.mysite.com/users?debug=true&disableConfirm&expabTestQa
    }

    private static class Bilder {

        public TestUrl.Builder withProtocol(String https) {
        }
    }
}


