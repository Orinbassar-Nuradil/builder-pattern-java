public interface HttpRequestBuilder {
    HttpRequestBuilder setMethod(String method);
    HttpRequestBuilder setUrl(String url);
    HttpRequestBuilder setBody(String body);
}

