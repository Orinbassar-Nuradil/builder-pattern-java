public class HttpRequestDirector {
    public void makeGetRequest(HttpRequestBuilder builder) {
        builder.setMethod(HttpMethod.GET)
               .setUrl("https://example.com");
    }

    public void makePostRequest(HttpRequestBuilder builder) {
        builder.setMethod(HttpMethod.POST)
               .setUrl("https://example.com")
               .setBody("{\"name\": \"Ali\"}");
    }
}

