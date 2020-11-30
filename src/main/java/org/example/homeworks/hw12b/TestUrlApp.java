package org.example.homeworks.hw12b;

import org.example.utils.TestUrl;

public class TestUrlApp {
    public static void main(String[] args) {

        String localDev=new TestUrl.Builder()
                .withProtocol("http")
                .withDomain("localhost")
                .withPort("8088")
                .withPath("/user")
                .build();//https://localhost:8080/user

        System.out.println(localDev);

        String testEnv=new TestUrl.Builder()
                .withProtocol("https")
                .withDomain("test.mytest.com")
                .withPath("/user")
                .withParam("debug","true")
                .withParam("disableConfirm")
                .withParam("exp","abTestQa")
                .withParam("exp1","abTestQa")
                .withParam("exp2","abTestQa")
                .withParam("exp3","abTestQa")
                .withParam("exp4","abTestQa")
                .withParam("exp5","abTestQa")
                .withParam("exp6","abTestQa")
                .build();//https://test.mysite.com/users?debag=true&disableConfirm&exp=abTestQa

        System.out.println(testEnv);

    }
}
