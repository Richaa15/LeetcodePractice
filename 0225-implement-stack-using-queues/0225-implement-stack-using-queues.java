class MyStack {
    private Queue<Integer> q = new LinkedList<>();

    MyStack() {
        // Constructor for the MyStack class. This initializes a private member variable 'q' as a new LinkedList.
    }

    void push(int x) {
        // This method is used to push an element onto the stack.

        q.add(x); // Add the new element 'x' to the queue 'q'.

        int v = q.size() - 1; // Get the current size of the queue 'q' and subtract 1, storing it in 'v'.
        int i = 0; // Initialize a variable 'i' to 0.

        while (i < v) {
            // Enter a loop that will run 'v' times (size - 1 times).

            q.add(q.poll()); // Remove the front element of the queue using poll() and add it to the back.
            i++; // Increment the counter 'i'.
        }
        // This loop effectively rearranges the queue's elements so that the newly added element is at the front,
        // simulating the behavior of a stack.
    }

    int pop() {
        // This method is used to pop (remove and return) the top element from the stack (queue in this case).

        return q.poll(); // Remove and return the front element of the queue.
    }

    int top() {
        // This method is used to get the value of the top element in the stack (queue in this case).

        return q.peek(); // Return the front element of the queue without removing it.
    }

    boolean empty() {
        // This method checks if the stack (queue) is empty.

        return q.isEmpty(); // Return true if the queue is empty, false otherwise.
    }
}
