package doc.example.http.cli;

import doc.example.domain.Airport;
import doc.example.http.client.RESTClient;

// a simple CLI interacting with a REST API to retrieve/display airports in specified cities
public class HTTPRestCLIApp {
    public static void main(String[] args) {
        RESTClient client = new RESTClient();

        // testing out with the city one of my brothers live in
        String cityName = "New York";
        Airport[] airports = client.getAirports(cityName);

        if (airports.length > 0) {
            System.out.println("Airports in " + cityName + " are the following:"); // should display amt of airports in a given area
            for (Airport airport : airports) {
                System.out.println(airport);
            }
        } else {
            System.out.println("Sorry! No airports were found in " + cityName); // if none found, display this message
        }
    }
}
