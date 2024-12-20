package airlineApiTests;

import utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class Base {
    public  static Map<String, Object> dataFromJsonFileDev;
    static {
        try{
            dataFromJsonFileDev = JsonUtils.getJsonDataAsMap("airlines/dev/PassengerAPIData.json");
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    public  static Map<String, Object> dataFromJsonFileQa;
    static {
        try{
            dataFromJsonFileQa = JsonUtils.getJsonDataAsMap("airlines/qa/PassengerAPIData.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
