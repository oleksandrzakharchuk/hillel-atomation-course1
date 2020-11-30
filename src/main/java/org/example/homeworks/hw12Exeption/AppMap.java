package org.example.homeworks.hw12Exeption;

import org.example.utils.TestUrl;

import java.util.HashMap;
import java.util.Map;

public class AppMap {

    public static void main(String[] args) {

        Map<String, String> params=new HashMap<>();
        params.put("key1","value1");
        params.put("key2","value2");
        params.put("key3","value3");

        System.out.println(
        new TestUrl.Builder()
                .withParams(params)
                .withProtocol("https")
                .withDomain("mysite.com")
                //.withParam("test")
                .withParam("someParam", "someValue")

                .build()
                         );
    }
}

