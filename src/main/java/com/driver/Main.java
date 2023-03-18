package com.driver;

public class Main {
    public static class Product {
        // Task 3
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5
        public double product(double x, double y) {
            return x * y;
        }

        public static void main(String[] args) {
            // Task 2
            Product p = new Product();

            // Task 3
            int result1 = p.product(3, 4);
            System.out.println(result1); // Output: 12

            // Task 4
            int result2 = p.product(2, 3, 4);
            System.out.println(result2); // Output: 24

            // Task 5
            double result3 = p.product(2.5, 3.5);
            System.out.println(result3); // Output: 8.75
        }
    }
}

