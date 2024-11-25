package Assignment1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RestUtils;
import java.util.HashMap;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.equalTo;

public class AirlineTests {

    // Create a new airline using the POST method and validate the response using assertions.
    @Test
    public void createAirlineTest() {
        String baseUrl = "https://api.instantwebtools.net/v1/airlines";
        String payLoad = "{\n" +
                "\"_id\": \"152356\", \n" +
                "\"name\": \"Assignment 1 Airline\", \n" +
                "\"country\": \"Pakistan\", \n" +
                "\"logo\": \"https://example.com/logos/american_airlines.png\", \n" +
                "\"slogan\": \"Assignment1\", \n" +
                "\"head_quarters\": \"Karachi\", \n" +
                "\"website\": \"https://www.assignment1.com\", \n" +
                "\"established\": \"2024\", \n" +
                "}";
        Response response = RestUtils.performPost(baseUrl, payLoad, new HashMap<>());
        Assert.assertEquals(response.statusCode(), 200, "Status code mismatch");
    }
        @Test
        public void getAirlineInfo(){
            RestAssured.baseURI = "https://api.instantwebtools.net/v1/airlines";
            String ID = "73dd5420-3bf9-48f3-a0b6-17cf7aa61b19";
            Response response = given()
                    .pathParam("id", ID).when().get("/{id}");
                     response.then()
                    .log().all()
                    .contentType(JSON)
                    .body("id", equalTo(ID));
            Assert.assertEquals(response.statusCode(), 200, "Status code mismatch");
            System.out.println(response.asString());
        }

    }
