import java.util.concurrent.locks.ReentrantLock;


public class Main22032021 extends Thread {
    public static int number = 0;

    private static final ReentrantLock mReentrantLock = new ReentrantLock();

    @Override
    public void run()
    {
        super.run();
        this.incrementNum();
    }

    public void incrementNum()
    {
        mReentrantLock.lock();
        System.out.printf("Thread %s: Number before updating %d\n", Thread.currentThread().getName(), number);
        number++;
        System.out.printf("Thread %s: Number after updating  %d\n", Thread.currentThread().getName(), number);
        mReentrantLock.unlock();
    }

    public static void main(String[] args)
    {
        final Main22032021 threadOne = new Main22032021();
        final Main22032021 threadTwo = new Main22032021();
        final Main22032021 threadThree = new Main22032021();
        final Main22032021 threadFour = new Main22032021();
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }
}
