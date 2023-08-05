package thread;

class CountRunnable implements Runnable {
    private int count;

    public CountRunnable(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=count;i>0;i--) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                // 스레드 1초 정지시키기 (waiting 상태로 변경되며 다른 스레드에게 CPU 점유권을 양도)
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
        System.out.println("terminate thread");
    }
}

public class ThreadConcurrencyDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new CountRunnable(10));
        Thread thread2 = new Thread(new CountRunnable(5));
        // 스레드 이름 변경
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread1.start();
        thread2.start();

        System.out.println("main end");
    }
}