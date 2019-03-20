package lesson8.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Roman");
        waitingQueue.add("Mohsen");
        waitingQueue.add("Asli");
        waitingQueue.add("Janek");

        System.out.println(waitingQueue);

        String name = waitingQueue.remove(); //deque operation
        System.out.println(name);

        name = waitingQueue.poll();

        System.out.println(name);

        System.out.println(waitingQueue);

    }

}
