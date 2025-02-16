/**
 * @author Ellis Fitzgerald
 * @version February 15, 2025,
 * Lab 3 Program File
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        long freeMemoryBytes = Runtime.getRuntime().freeMemory();
        System.out.println("The current amount of free memory is " + freeMemoryBytes + " Bytes");
    }
}
