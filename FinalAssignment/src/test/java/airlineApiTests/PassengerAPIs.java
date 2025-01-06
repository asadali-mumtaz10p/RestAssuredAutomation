package airlineApiTests;

import RestUtils.RestUtils;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import pojos.Passenger;

import java.util.HashMap;

public class PassengerAPIs {
    @Step
    public Response createPassenger(String createPassengerPayload){
        String endPoint = (String) Base.dataFromJsonFileDev.get("createPassengerEndPoint");
        return RestUtils.performPost(endPoint, createPassengerPayload, new HashMap<>());
    }
    @Step
    public Response createPassenger(Passenger createPassengerPayload){
        String endPoint = (String) Base.dataFromJsonFileDev.get("createPassengerEndPoint");
        return RestUtils.performPost(endPoint, createPassengerPayload, new HashMap<>());
    }
    @Step
    public Response  updatePassenger(String updatePassengerPayload) {
        String endPoint = (String) Base.dataFromJsonFileQa.get("updatePassengerEndPoint");
        return RestUtils.performPatch(endPoint, updatePassengerPayload, new HashMap<>());
    }
    @Step
    public Response  updatePassenger(Passenger updatePassengerPayload) {
        String endPoint = (String) Base.dataFromJsonFileQa.get("updatePassengerEndPoint");
        return RestUtils.performPatch(endPoint, String.valueOf(updatePassengerPayload), new HashMap<>());
    }
}
