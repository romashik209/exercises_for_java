public class multithreading extends Thread {

    private int threadNumber;

    public multithreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
            if (threadNumber == 2) {
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
