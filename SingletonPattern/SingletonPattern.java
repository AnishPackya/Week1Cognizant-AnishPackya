package SingletonPattern;

public class SingletonPattern {

    // Step 1: Create a private static instance of the class
    private static SingletonPattern instance;

    // Step 2: Make the constructor private to prevent instantiation
    private SingletonPattern() {
        System.out.println("Singleton instance created.");
    }

    // Step 3: Provide a public static method to get the instance (with thread safety)
    public static synchronized SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    // Main method to test the pattern
    public static void main(String[] args) {
        // Try to create two instances
        SingletonPattern obj1 = SingletonPattern.getInstance();
        SingletonPattern obj2 = SingletonPattern.getInstance();

        // Call a method
        obj1.showMessage();

        // Check if both references point to the same object
        if (obj1 == obj2) {
            System.out.println("Both references point to the same Singleton instance.");
        } else {
            System.out.println("Different instances exist (error in Singleton).");
        }
    }
}
