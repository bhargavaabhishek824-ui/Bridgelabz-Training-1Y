package UniversityExamHallManagement;
public class ExamHallSystem {
    public static void main(String[] args) {
        Thread entry = new Thread(new ExamTask("Student Entry Monitoring", 0, 8000));
        Thread question = new Thread(new ExamTask("Question Paper Distribution", 5000, 3000));
        Thread attendance = new Thread(new ExamTask("Attendance Marking", 10000, 3000));
        Thread collection = new Thread(new ExamTask("Answer Sheet Collection", 15000, 4000));
        question.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);
        System.out.println("Initial States:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("Question: " + question.getState());
        System.out.println("Attendance: " + attendance.getState());
        System.out.println("Collection: " + collection.getState());
        entry.start();
        question.start();
        attendance.start();
        collection.start();
        try {
            while (entry.isAlive() || question.isAlive() ||
                   attendance.isAlive() || collection.isAlive()) {
                System.out.println("\n--- Thread States ---");
                System.out.println("Entry: " + entry.getState());
                System.out.println("Question: " + question.getState());
                System.out.println("Attendance: " + attendance.getState());
                System.out.println("Collection: " + collection.getState());
                Thread.sleep(2000);
            }
            entry.join();
            question.join();
            attendance.join();
            collection.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("\nAll exam activities completed successfully!");
    }
}