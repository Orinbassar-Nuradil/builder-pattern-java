public class HttpRequestObjectBuilder implements HttpRequestBuilder {
    private String method;
    private String url;
    private String body;

    @Override
    public HttpRequestObjectBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    @Override
    public HttpRequestObjectBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public HttpRequestObjectBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public HttpRequest getResult() {
        if (url == null || url.isBlank()) {
            throw new IllegalStateException("URL is required");
        }
        if (HttpMethod.POST.equals(method) && (body == null || body.isBlank())) {
            throw new IllegalStateException("POST requires a body");
        }
        return new HttpRequest(method, url, body);
    }
}

