package UniversityExamHallManagement;
public class ExamTask implements Runnable {
    String taskName;
    int startDelay;  
    int workTime;     
    ExamTask(String name, int delay, int workTime) {
        this.taskName = name;
        this.startDelay = delay;
        this.workTime = workTime;
    }
    public void run() {
        try {
            Thread.sleep(startDelay);
            System.out.println(taskName + " started | State: " +
                    Thread.currentThread().getState());
            Thread.sleep(workTime);
            System.out.println(taskName + " completed.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
