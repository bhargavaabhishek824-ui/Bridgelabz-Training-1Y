package SmartHomeAutomation;
import java.time.LocalTime;
public class Device implements Runnable {
 private String name;
 private int interval;

 public Device(String name, int interval) {
     this.name = name;
     this.interval = interval;
 }

 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         String time = LocalTime.now().toString();

         System.out.println(
             name + " | Time: " + time +
             " | Thread: " + Thread.currentThread().getName() +
             " | Priority: " + Thread.currentThread().getPriority() +
             " | Cycle: " + i
         );

         try {
             Thread.sleep(interval);
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }

     System.out.println(name + " completed all cycles.\n");
 }
}

