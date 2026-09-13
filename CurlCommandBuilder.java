public class CurlCommandBuilder implements HttpRequestBuilder {
    private String method;
    private String url;
    private String body;

    @Override
    public CurlCommandBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    @Override
    public CurlCommandBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public CurlCommandBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public String getResult() {
        if (url == null || url.isBlank()) {
            throw new IllegalStateException("URL is required");
        }
        if (HttpMethod.POST.equals(method) && (body == null || body.isBlank())) {
            throw new IllegalStateException("POST requires a body");
        }
        String command = "curl -X " + method + " \"" + url + "\"";
        if (body != null) {
            command += " -d '" + body + "'";
        }
        return command;
    }
}

