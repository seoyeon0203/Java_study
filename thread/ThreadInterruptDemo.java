package thread;

class InterruptableRunnable implements Runnable {

    @Override
    public void run() {
        while(true) {
            boolean isInterrupted = Thread.currentThread().isInterrupted();
            if(!isInterrupted) {
                System.out.println("running... " + isInterrupted);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException!");
                    break;
                }
            } else {
                break;
            }
        }
    }
}

public class ThreadInterruptDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new InterruptableRunnable());
        thread.start();

        (new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.println("call interrupt from another thread!");
                thread.interrupt();
            }
        })).start();
    }
}