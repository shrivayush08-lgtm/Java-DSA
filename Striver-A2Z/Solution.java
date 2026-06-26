public class Solution {

    public static void pattern19(int n) {

        // Upper Half
        for (int i = 0; i < n; i++) {

            // Left Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = 1; i <= n; i++) {

            // Left Stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern19(5);
    }
}