package gr.aueb.cf.cf9.ch16.threads;

public class Main {
    public static void main(String[] args) {
        WorkerThread worker = new WorkerThread();
        WorkerThread worker2 = new WorkerThread();
        WorkerThread worker3 = new WorkerThread();
        WorkerThread worker4 = new WorkerThread();
        WorkerThread worker5 = new WorkerThread();
        WorkerThread worker6 = new WorkerThread();
        WorkerThread worker7 = new WorkerThread();

        Thread thread = new Thread(worker);

        thread.start();
        new Thread(worker2).start();
        new Thread(worker3).start();
        new Thread(worker4).start();
        new Thread(worker5).start();
        new Thread(worker6).start();
        new Thread(worker7).start();
    }
}
