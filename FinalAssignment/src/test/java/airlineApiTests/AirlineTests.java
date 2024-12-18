package airlineApiTests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class AirlineTests {

    @Test
    public void createAirlineTest(){
        String baseURL = "https://api.instantwebtools.net/v1/airlines";
        String payload = Payloads.getAirlinePayloadViaString("252d3bca-d9bb-476c-9a97-562d685e235c", "Karachi Airways",
                "Pakistan", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
                "From Pakistan","Karachi, Pakistan", "www.karachiairways.com", "2024");
        Response response = RestUtils.performPost(baseURL, payload, new HashMap<>());
        Assert.assertEquals(response.statusCode(),200);
    }

    @Test
    public void createAirlineTestWithMap(){
        String baseURL = "https://api.instantwebtools.net/v1/airlines";
        Map<String, Object> payload = Payloads.getAirlinePayloadByMap("252d3bca-d9bb-476c-9a97-562d685e235c", "Karachi Airways",
                "Pakistan", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
                "From Pakistan","Karachi, Pakistan", "www.karachiairways.com", "2024");
        Response response = RestUtils.performPost(baseURL, payload, new HashMap<>());
        Assert.assertEquals(response.statusCode(),200);
    }
}
