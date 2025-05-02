package exceptionHandling;

import java.util.LinkedList;
import java.util.Queue;

public class ExceptionDemoCode {
    public static void main(String[] args) throws StackUnderFlowException {
        Queue<Integer> que = new LinkedList<>();
        QueueWithException queue = new QueueWithException();
        try {
            System.out.println(queue.getPop(que));
        } catch (StackUnderFlowException ex) {
            System.out.println("Exception caught: " + ex);
        }
    }
}
