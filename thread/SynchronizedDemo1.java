package thread;

class SharedCounter {
    public long count = 0;
    // ����ȭ�Ǿ� ���� ������ �߻����� �ʴ� �޼���
    /*
    public synchronized void increase() {
        this.count++;
    }
    */
    // ����ȭ���� ���� ���� ������ �߻��� �� �ִ� �޼���
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
// �� �����忡�� 100�� �ݺ��ϸ� 1�� ������Ű�Ƿ�, �������� ��밪�� 200
        // int loop = 1_00;
// ���� Ƚ���� �÷����Ƿ�, ��밪�� 2�鸸 (���� ������ �����?)
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
// ������ ����ɶ����� ��ٸ��� ���ؼ� join �޼��� ȣ�� (main ������� waiting ���°� ��)
        t1.join();
        t2.join();
// ���� ����� Ȯ��
        System.out.println("count result : " + counter.count);
    }
}

