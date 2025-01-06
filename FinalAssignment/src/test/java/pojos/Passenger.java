package pojos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Passenger {
    private String name;
    private int trips;
    private String airline;
}
