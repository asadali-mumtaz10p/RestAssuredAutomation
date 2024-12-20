package airlineApiTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import RestUtils.RestUtils;

import java.util.HashMap;

public class AirlineTests extends PassengerAPIs {

    @Test
    public void createPassenger(){
        String payload = Payloads.getPassengerPayloadViaString("asad", "5", "66038402-402d-4a3f-baef-7cb5f53697a8");
        Response response = createPassenger(payload);
        Assert.assertEquals(response.statusCode(),200);
    }

    @Test
    public void getPassenger(){
        String baseURL = "https://api.instantwebtools.net/v1/passenger/67651941596c781cbd71bce5";
        Response response = RestAssured.get(baseURL);
        Assert.assertEquals(response.statusCode(),200);
    }

    @Test
    public void updatePassenger(){
        String payload = Payloads.updatePassengerPayloadViaString("asad ali");
        Response response = updatePassenger(payload);
        Assert.assertEquals(response.statusCode(),200);
    }
    @Test
    public void deletePassenger(){
        String baseURL = "https://api.instantwebtools.net/v1/passenger/67651941596c781cbd71bce5";
        Response response = RestAssured.delete(baseURL);
        Assert.assertEquals(response.statusCode(),204);
    }

}
