public class Fibonacci {
    public static void main(String[] args) {
        int count = 10; // You can modify this value as needed
        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + count + " terms:");
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

}