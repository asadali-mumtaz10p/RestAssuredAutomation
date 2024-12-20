package airlineApiTests;

import java.util.HashMap;
import java.util.Map;

public class Payloads {

    public static String getPassengerPayloadViaString(String name, String trips, String airline) {
        String payload = "{\n" +
                "    \"name\": \"" + name + "\",\n" +
                "    \"trips\": " + trips + ",\n" +
                "    \"airline\": \"" + airline + "\"\n" +
                "}";
        return payload;
    }
    public static String updatePassengerPayloadViaString(String name){
        String payload = "{\n" +
                "    \"name\": \"" + name + "\"\n" +
                "}";
        return payload;
    }
}
