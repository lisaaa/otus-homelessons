package otus.project;

public class WaitNotifySimpleApp {

    private class PrintAlphabets {
        private String value;
        public void a() {
            value = "A";
            System.out.print(value);
        }
        public void b() {
            value = "B";
            System.out.print(value);
        }

        public void c() {
            value = "C";
            System.out.print(value);
        }
    }

    private final Object mon = new Object();
    private PrintAlphabets PrintAlphabets = new PrintAlphabets();

    public static void main(String[] args) throws InterruptedException {
        WaitNotifySimpleApp waitNotifyApp = new WaitNotifySimpleApp();
        new Thread(() -> {
            waitNotifyApp.printA();
        }).start();
        new Thread(() -> {
            waitNotifyApp.printB();
        }).start();
        new Thread(() -> {
            waitNotifyApp.printC();
        }).start();
    }
    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (PrintAlphabets.value != "C" && PrintAlphabets.value != null) {
                        mon.wait();
                    }
                    PrintAlphabets.a();
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (PrintAlphabets.value != "A") {
                        mon.wait();
                    }
                    PrintAlphabets.b();
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while ( PrintAlphabets.value != "B") {
                        mon.wait();
                    }
                    PrintAlphabets.c();
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

