
import java.util.ArrayList;

class SafeList {

    private ArrayList<String> list = new ArrayList<>();


    public synchronized void addElement(String element) {

        list.add(element);

        System.out.println(element + " added to the list.");
    }


    public synchronized int getSize() {

        return list.size();
    }


    public synchronized void removeElement(String element) {

        if (list.remove(element)) {

            System.out.println(element + " removed from the list.");

        } else {

            System.out.println(element + " not found.");
        }
    }
}

public class Task2 {

    public static void main(String[] args) {

        SafeList safeList = new SafeList();


        Thread t1 = new Thread(() -> {

            safeList.addElement("Apple");
            safeList.addElement("Banana");
            safeList.addElement("Orange");

        });


        Thread t2 = new Thread(() -> {

            safeList.addElement("Mango");
            safeList.addElement("Grapes");

        });


        Thread t3 = new Thread(() -> {

            safeList.removeElement("Apple");

        });


        Thread t4 = new Thread(() -> {

            System.out.println("List size: " + safeList.getSize());

        });


        t1.start();
        t2.start();
        t3.start();
        t4.start();


        try {

            t1.join();
            t2.join();
            t3.join();
            t4.join();

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Final list size: " + safeList.getSize());

    }
}
