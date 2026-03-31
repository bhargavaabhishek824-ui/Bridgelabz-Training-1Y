package MultiThreadingTwo;
public class Runner {
    static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread t = new Thread();
        t1.start();
        t1.start();
    }
}