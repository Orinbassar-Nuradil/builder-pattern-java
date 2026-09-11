public class Main {
    public static void main(String[] args) {
        HttpRequestDirector director = new HttpRequestDirector();
        HttpRequestObjectBuilder objectBuilder = new HttpRequestObjectBuilder();
        director.makePostRequest(objectBuilder);
        HttpRequest request = objectBuilder.getResult();
        System.out.println("Object: " + request);
        CurlCommandBuilder curlBuilder = new CurlCommandBuilder();
        director.makePostRequest(curlBuilder);
        String curl = curlBuilder.getResult();
        System.out.println("cURL: " + curl);
    }
}
