package airlineApiTests;

import net.datafaker.Faker;
import pojos.Passenger;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Payloads {

//    public static String getPassengerPayloadViaString(String name, String trips, String airline) {
//        String payload = "{\n" +
//                "    \"name\": \"" + name + "\",\n" +
//                "    \"trips\": " + trips + ",\n" +
//                "    \"airline\": \"" + airline + "\"\n" +
//                "}";
//        return payload;
//    }

    public static String getPassengerPayloadByFakerClass() {
        Faker faker = new Faker();
        String payload = "{\n" +
                "    \"name\": \"" + faker.name().firstName() + "\",\n" +
                "    \"trips\": " + faker.number().digits(2) + ",\n" +
                "    \"airline\": \"" + faker.numerify("66038402-402d-4a3f-baef-7cb5f53697a8") + "\"\n" +
                "}";
        return payload;
    }
    public static Passenger getPassengerPayloadUsingPojo(){
        Faker faker = new Faker();
        return Passenger
                .builder()
                .name(faker.name().firstName())
                .trips(Integer.parseInt(faker.number().digits(2)))
                .airline(faker.numerify("66038402-402d-4a3f-baef-7cb5f53697a8"))
                .build();

    }

//    public static String updatePassengerPayloadViaString(String name){
//        String payload = "{\n" +
//                "    \"name\": \"" + name + "\"\n" +
//                "}";
//        return payload;
//    }
    public static String updatePassengerPayloadByFakerClass(){
        Faker faker = new Faker();
        String payload = "{\n" +
                "    \"name\": \"" + faker.name().firstName() + "\"\n" +
                "}";
        return payload;
    }
    public static Passenger updatePassengerPayloadWithPojo() {
        Faker faker = new Faker();
        return Passenger
                .builder()
                .name(faker.name().firstName())
                .build();
    }
}
