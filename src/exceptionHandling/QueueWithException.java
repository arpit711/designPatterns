package exceptionHandling;

import java.util.Queue;

public class QueueWithException {
    public Integer getPop(Queue<Integer> queue) throws StackUnderFlowException {
        if (queue.isEmpty()) throw new StackUnderFlowException("The element is not present in stack");
        else return queue.poll();
    }
}
