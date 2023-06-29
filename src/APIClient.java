import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIClient {
    public static void main(String[] args) {
        try {
            String uri = "https://postman-echo.com/get";
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
//            // Create a URL object with the API endpoint
//            URL url = new URL("https://vindecoder.p.rapidapi.com/decode_vin?vin=4F2YU09161KM33122");
//
//            // Open a connection to the URL
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//            // Set the request method
//            connection.setRequestMethod("GET");
//
//            // Set any required headers
//            connection.setRequestProperty("Content-Type", "application/json");
//            // You can set additional headers as needed
//
//            // Get the response code
//            int responseCode = connection.getResponseCode();
//            System.out.println("Response Code: " + responseCode);
//
//            // Read the response from the API
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            String line;
//            StringBuilder response = new StringBuilder();
//
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//            reader.close();
//
//            // Print the response
//            System.out.println("Response: " + response.toString());
//
//            // Disconnect the connection
//            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
