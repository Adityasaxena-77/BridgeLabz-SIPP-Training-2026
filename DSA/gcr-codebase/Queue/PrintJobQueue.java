import java.util.ArrayDeque;
import java.util.Deque;
public class PrintJobQueue {
    private final Deque<Integer> jobs = new ArrayDeque<>();

    public void submitJob(int jobId) {
        jobs.addLast(jobId);
    }

    public void submitUrgentJob(int jobId) {
        jobs.addFirst(jobId);
    }

    public int printNextJob() {
        if (jobs.isEmpty()) {
            throw new IllegalStateException("No print jobs are waiting");
        }
        return jobs.removeFirst();
    }

    public boolean isEmpty() {
        return jobs.isEmpty();
    }

    public static void main(String[] args) {
        PrintJobQueue printQueue = new PrintJobQueue();
        printQueue.submitJob(201);
        printQueue.submitJob(202);
        printQueue.submitUrgentJob(999);

        while (!printQueue.isEmpty()) {
            System.out.println("Printing job: " + printQueue.printNextJob());
        }
    }
}
