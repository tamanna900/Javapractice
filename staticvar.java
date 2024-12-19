
class Counter {
    static int count = 0; // Static variable shared by all instances

    // Method to increment the static count variable
    void increment() {
        count++;
    }

    // Method to print the value of the static count variable
    void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class staticvar {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.increment(); // Increments the count
        counter1.displayCount(); // Output: Count: 1

        counter2.increment(); // Increments the count (shared across all instances)
        counter2.displayCount(); // Output: Count: 2

        counter1.displayCount(); // Output: Count: 2 (since it's shared)
    }
}

