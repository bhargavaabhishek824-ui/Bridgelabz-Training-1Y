package SreamAPI.Two;
import java.util.*;
import java.util.stream.*;
public class Main {
    static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. A", "Cardiology", true),
                new Doctor("Dr. B", "Neurology", false),
                new Doctor("Dr. C", "Orthopedics", true),
                new Doctor("Dr. D", "Dermatology", true),
                new Doctor("Dr. E", "Pediatrics", false)
        );
        List<Doctor> availableDoctors = doctors.stream()
                .filter(d -> d.availableOnWeekend)

                .sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty))

                .collect(Collectors.toList());

        availableDoctors.forEach(System.out::println);
    }
}