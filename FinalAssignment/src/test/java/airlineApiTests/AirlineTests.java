package airlineApiTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import RestUtils.RestUtils;
import pojos.Passenger;

import java.util.HashMap;

public class AirlineTests extends PassengerAPIs {

    @Test
    @Description("This is creating a new Passenger through Data Faker")
    public void createPassenger() {
        String payload = Payloads.getPassengerPayloadByFakerClass();
        Response response = createPassenger(payload);
        Assert.assertEquals(response.statusCode(), 200);
        String name = response.jsonPath().getString("name");
        Assert.assertNotNull(name, "Name should not be null");
        System.out.println("Passenger Name: " + name);
    }
    @Test
    @Description("This is creating a new Passenger through Pojo")
    public void createPassengerWithPojo() {
        Passenger payload = Payloads.getPassengerPayloadUsingPojo();
        Response response = createPassenger(payload);
        Assert.assertEquals(response.statusCode(), 200);
        String name = response.jsonPath().getString("name");
        Assert.assertEquals(name, payload.getName(), "Name should match the payload");
        System.out.println("Passenger Name: " + name);
    }
    @Test
    @Description("This is updating the Passenger through Data Faker")
    public void updatePassenger() {
        String payload = Payloads.updatePassengerPayloadByFakerClass();
        Response response = updatePassenger(payload);
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test
    @Description("This is updating the Passenger through Pojo")
    public void updatePassengerWithPojo() {
        Passenger payload = Payloads.updatePassengerPayloadWithPojo();
        Response response = updatePassenger(payload);
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test
    @Description("This is getting the info of Passenger")
    public void getPassenger() {
        String baseURL = "https://api.instantwebtools.net/v1/passenger/66a4ddc75736a93bef80c6be";
        Response response = RestAssured.get(baseURL);
        Assert.assertEquals(response.statusCode(), 200);
    }

    @Test
    @Description("This is deleting the Passenger")
    public void deletePassenger() {
        String baseURL = "https://api.instantwebtools.net/v1/passenger/67651941596c781cbd71bce5";
        Response response = RestAssured.delete(baseURL);
        Assert.assertEquals(response.statusCode(), 200);
    }

}
