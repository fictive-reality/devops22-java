package se.nackademin.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("B");
        queue.add("C");
        queue.add("A");
        // Peek whats on the queue
        System.out.println("peek: " + queue.peek());

        // Get the next item "poll"
        System.out.println("poll: " + queue.poll());
        System.out.println("poll: " + queue.poll());
        System.out.println("poll: " + queue.poll());
        System.out.println("poll: " + queue.poll());

        PriorityQueue<Custom> customQueue = new PriorityQueue<>();
        customQueue.add(new Custom("first"));
        Custom c2 = new Custom("second");
        customQueue.add(c2);
        customQueue.add(new Custom("third"));

        // customQueue.remove(c2);

        for (Custom c : customQueue.toArray(new Custom[2])) {
            System.out.println(c.getName());
        }

    }

}
