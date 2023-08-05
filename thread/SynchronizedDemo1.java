package thread;

class SharedCounter {
    public long count = 0;
    // 동기화되어 경쟁 조건이 발생하지 않는 메서드
    /*
    public synchronized void increase() {
        this.count++;
    }
    */
    // 동기화되지 않은 경쟁 조건이 발생할 수 있는 메서드
    synchronized public void increase() {
        this.count++;
    }
}
class IncrementRunnable implements Runnable {
    private SharedCounter counter;
    private String name;
    public IncrementRunnable(SharedCounter counter, String name) {
        this.counter = counter;
        this.name = name;
    }
    @Override
    public void run() {
// 두 스레드에서 100번 반복하며 1씩 증가시키므로, 정상적인 기대값은 200
        // int loop = 1_00;
// 루프 횟수를 늘렸으므로, 기대값은 2백만 (실제 관측한 결과는?)
 int loop = 1_000_000;
        for(int i=0;i<loop;i++) {
            this.counter.increase();
        }
    }
}
public class SynchronizedDemo1 {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();
        Thread t1 = new Thread(new IncrementRunnable(counter, "1"));
        Thread t2 = new Thread(new IncrementRunnable(counter, "2"));
        t1.start();
        t2.start();
// 스레드 종료될때까지 기다리기 위해서 join 메서드 호출 (main 스레드는 waiting 상태가 됨)
        t1.join();
        t2.join();
// 최종 결과값 확인
        System.out.println("count result : " + counter.count);
    }
}

