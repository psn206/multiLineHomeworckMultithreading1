public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("Group");
        int numberThreads = 4;
        for (int i = 0; i < numberThreads; i++) {
            MyThread myThread = new MyThread();
            myThread.setName("Поток" + i);
            new Thread(threadGroup, myThread).start();
        }
        try {
            Thread.sleep(15000);

        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван!");
        }
        System.out.println("Завершаю все потоки");
        threadGroup.interrupt();


    }
}
