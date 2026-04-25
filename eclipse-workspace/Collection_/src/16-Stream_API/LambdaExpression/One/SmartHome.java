package One;

public class SmartHome {
    static void main(String[] args) {
        LightBehavior motionLight = () -> {
            System.out.println("Motion detected -> Lights ON at Full brightness");
        };

        LightBehavior nightLight = () -> {
            System.out.println("Night mode -> Lights dimmed to 30%");
        };

        LightBehavior voiceLight = () -> {
            System.out.println("Voice command -> Lights turned BLUE");
        };

        motionLight.activate();
        nightLight.activate();
        voiceLight.activate();
    }
}