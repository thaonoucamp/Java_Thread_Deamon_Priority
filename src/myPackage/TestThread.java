package myPackage;

public class TestThread extends Thread{
    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        TestThread t3 = new TestThread();

        t1.setName("a");
        t2.setName("b");
        t3.setName("c");

        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(5);

        t1.start();
        t2.start();
        t3.start();



//        TestThread t4 = new TestThread();
//        TestThread t5 = new TestThread();
//

    }
}
// do uu tien 1 - 10;

//
