package airlineApiTests;

import RestUtils.RestUtils;
import io.restassured.response.Response;
import java.util.HashMap;

public class PassengerAPIs {
    public Response createPassenger(String createPassengerPayload){
        String endPoint = (String) Base.dataFromJsonFileDev.get("createPassengerEndPoint");
        return RestUtils.performPost(endPoint, createPassengerPayload, new HashMap<>());
    }
    public Response updatePassenger(String updatePassengerPayload) {
        String endPoint = (String) Base.dataFromJsonFileQa.get("updatePassengerEndPoint");
        return RestUtils.performPatch(endPoint, updatePassengerPayload, new HashMap<>());
    }
}
