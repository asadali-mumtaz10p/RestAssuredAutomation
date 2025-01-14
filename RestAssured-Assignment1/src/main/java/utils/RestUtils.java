package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RestUtils {

    public static Response performPost(String endPoint, Map<String, Object> requestPayload, Map<String, String> headers){
        return RestAssured.given().log().all()
                .baseUri(endPoint)
                .contentType(ContentType.JSON)
                .headers(headers)
                .body(requestPayload)
                .post()
                .then().log().all().extract().response();
    }

    public static Response performGet(String endPoint, Map<String, Object> requestPayload, Map<String, String> headers){
        return RestAssured.given().log().all()
                .baseUri(endPoint)
                .headers(headers)
                .get()
                .then().log().all().extract().response();
    }
}
