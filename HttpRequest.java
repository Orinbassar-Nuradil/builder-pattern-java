public final class HttpRequest {
    private final String method;
    private final String url;
    private final String body;

    HttpRequest(String method, String url, String body) {
        this.method = method;
        this.url = url;
        this.body = body;
    }

    public String getMethod() { return method; }
    public String getUrl() { return url; }
    public String getBody() { return body; }

    @Override
    public String toString() {
        return "HttpRequest{method='" + method + "', url='" + url + "', body='" + body + "'}";
    }
}

