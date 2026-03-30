package SmartHomeAutomation;
public class SmartHomeAutomation {
    public static void main(String[] args) {
        Thread temp = new Thread(new Device("Temperature Sensor", 5000), "Temp-Thread");
        Thread security = new Thread(new Device("Security Camera", 3000), "Security-Thread");
        Thread light = new Thread(new Device("Light Controller", 4000), "Light-Thread");
        Thread door = new Thread(new Device("Door Lock Monitor", 6000), "Door-Thread");
        security.setPriority(10); // Highest
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);
        temp.start();
        security.start();
        light.start();
        door.start();
        try {
            temp.join();
            security.join();
            light.join();
            door.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("All devices finished. Smart Home System OFF.");
    }
}