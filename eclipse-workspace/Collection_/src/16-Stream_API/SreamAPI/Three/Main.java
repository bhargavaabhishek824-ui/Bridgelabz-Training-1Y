package SreamAPI.Three;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Vehicle", 8000),
                new Claim("Health", 7000),
                new Claim("Property", 12000),
                new Claim("Vehicle", 6000),
                new Claim("Health", 9000)
        );
        Map<String, Double> avgClaimByType = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getType,
                        Collectors.averagingDouble(Claim::getAmount)
                ));

        avgClaimByType.forEach((type, avg) ->
                System.out.println(type + " → Average Claim: " + avg)
        );
    }
}