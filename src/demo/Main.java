package demo;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));

        // Demonstrate that both variables point to the same instance
        System.out.println("Instance 1 hashcode: " + singleton1.hashCode());
        System.out.println("Instance 2 hashcode: " + singleton2.hashCode());
    }
    }
