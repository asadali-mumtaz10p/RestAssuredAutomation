package Assignment1;

import java.util.HashMap;
import java.util.Map;

public class Payloads {
    public static Map<String, Object> getAirlinePayloadByMap(String id, String name, String country, String logo,
                                                             String slogan, String headQuarters, String website, String established) {
        Map<String, Object> payload = new HashMap<>();

        payload.put("_id", id);
        payload.put("name", name);
        payload.put("country", country);
        payload.put("logo", logo);
        payload.put("slogan", slogan);
        payload.put("head_quaters", headQuarters);
        payload.put("website", website);
        payload.put("established", established);
        return payload;
    }

    public static Map<String, Object> getAirlineInfoPayloadByMap(String id) {
        Map<String, Object> payload = new HashMap<>();
        payload.put("_id", id);
        return payload;
    }
}