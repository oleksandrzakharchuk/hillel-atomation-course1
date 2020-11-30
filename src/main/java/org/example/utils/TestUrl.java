package org.example.utils;


import java.util.HashMap;
import java.util.Map;

public class TestUrl{
        private String protocol = "";
        private String domain = "";
        private String port = "";
        private String path = "";
        private Map<String, String> params = new HashMap<>();

        private TestUrl() {
        }

        public TestUrl(String protocol, String domain, String port, String path, Map<String, String> params) {
            this.protocol = protocol;
            this.domain = domain;
            this.port = port;
            this.path = path;
            this.params = params;

        }

        public static void editorUrl() {
        }

        public String getProtocol() {
            return protocol;
        }

        public String getDomain() {
            return domain;
        }

        public String getPort() {
            return port;
        }

        public String getPath() {
            return path;
        }


        public Map<String, String> getParams() {
            return params;
        }
public static class Builder {
    private final TestUrl url;

    public Builder() {
        url = new TestUrl();
    }

    public Builder withProtocol(String protocol) {
        url.protocol = protocol;
        return this;
    }

    public Builder withDomain(String domain) {
        url.domain = domain;
        return this;
    }

    public Builder withPort(String port) {
        url.port = port;
        return this;
    }

    public Builder withPath(String path) {
        url.path = path;
        return this;

    }

    public Builder withParam(String param) {
        url.params.put(param, " ");
        return this;
    }

    public Builder withParam(String key, String value) {
        url.params.put(key, value);
        return this;
    }
    public Builder withParams(Map<String, String>params){
        url.params.putAll(params);
        return  this;
    }
    //TODO:Switch to java net.URL
    //public URL build();
    public String build() {
        String resultUrl ="";
        //protocol://-domaim-:port-/path-?params&

        if (url.protocol.isBlank())
            throw new IllegalArgumentException("Protocol cannot be blank");

        else if (!url.protocol.endsWith("://"))
            resultUrl += url.protocol + "://";
        else
            resultUrl += url.protocol;


        if (url.domain.isBlank()) {//isBlank()==!=null&&url.domain.trim().isEmpty()
            throw new IllegalArgumentException("Domain cannot be blank");
        } else {
            resultUrl += url.domain;
        }
        if (!url.port.isBlank()) {
            resultUrl += url.port.startsWith(":") ? url.port : ":" + url.port;
        }


        if (!url.path.isBlank()) {
            resultUrl += url.path.startsWith("/") ? url.path : "/" + url.path;

        }

        String parameters = "?";
        if (!url.params.isEmpty()){
            for(Map.Entry<String, String> param:url.params.entrySet()){
                if(param.getValue().isEmpty())
                    parameters += param.getKey()+"&";
                else
                    parameters += param.getKey()+"="+param.getValue()+"&";

            }
        }else{
            parameters ="";
        }
        return resultUrl += parameters;
    }
    public TestUrl getUrl(){
        return url;
    }
}
        }
