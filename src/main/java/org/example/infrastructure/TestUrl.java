package org.example.infrastructure;



public class TestUrl {
    private String protocol = "";
    private String domain = "";
    private String port = "";
    private String path = "";
    private String params = "";

    private TestUrl() {
    }

    public TestUrl(String protocol, String domain, String port, String path, String params) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.params = params;

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

    public String getParams() {
        return params;
    }

    public static class Builder {
        private TestUrl url;

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
            url.params += param + "&";
            return this;
        }

        public Builder withParam(String key, String value) {
            url.params += key + "=" + value + "&";
            return this;

        }


        public String build() {
            String resultUrl = "";
            //protocol://-domaim-:port-/path-?params&

            if (url.protocol.isBlank())
                resultUrl += "https://";//TODO: change to throwing exception
            else if(!url.protocol.endsWith("://"))
                resultUrl += url.protocol + "://";
            else
                resultUrl += url.protocol;


                if (url.domain.isBlank()) {//isBlank()==!=null&&url.domain.trim().isEmpty()
                    resultUrl += "localhost";//TODO:change to throwing exception
                } else {
                    resultUrl += url.domain;
                }
                if (!url.port.isBlank()) {
                    resultUrl += url.port.startsWith(":") ? url.port : ":" + url.port;
                }


                if (!url.path.isBlank()) {
                    resultUrl += url.path.startsWith("/") ? url.path : "/" + url.path;
                }


                if (!url.params.isBlank()) {
                    resultUrl += "?" + url.params;
                }
                return resultUrl;

            }

        }
    }





