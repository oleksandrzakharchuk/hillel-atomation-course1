package org.example.infrastructure;



public class TestUrl {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private String params;

    private TestUrl(){}

    public TestUrl(String protocol, String domain, String port, String path, String params) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.params = params;

    }

    public String getProtocol() {return protocol;}

    public String getDomain() {return domain;}

    public String getPort() {return port;}

    public String getPath() {return path;}

    public String getParams() {return params;}

    public static class Builder {
        private TestUrl url;

        public Builder(){
           url=new TestUrl();
    }

    public Builder withProtocol(String protocol) {
    url.protocol= protocol;
    return this;
        }

        public Builder withDomain(String domain) {

            return this;
        }

        public Builder withPort(String port) {

            return this;
        }

        public Builder withPath(String path) {

            return this;

        }

        public Builder withParam(String param) {

            return this;
        }

        public Builder withParam(String key, String value) {

            return this;

        }

        public String  build() {
        return "";

        }
    }

}


