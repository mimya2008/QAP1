public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(0, 0, 0); // Default initialization
        Time t2 = new Time(0, 0, 0);

        // Set times using set methods
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Display initial times before calling nextSecond() and previousSecond()
        System.out.println("Before change:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);

        // Modify times
        t1.nextSecond(); // Increment t1 by 1 second
        t2.previousSecond(); // Decrement t2 by 1 second

        // Display final times
        System.out.println("\nAfter change:");
        System.out.println("t1 (after nextSecond): " + t1);
        System.out.println("t2 (after previousSecond): " + t2);
    }
}
