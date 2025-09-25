package basic_oop02;

public class OverLoad {
    
    // Method overloading - same method name, different parameters
    
    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method 2: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method 3: Add two double numbers
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method 4: Add two strings (concatenation)
    public String add(String a, String b) {
        return a + b;
    }
    
    // Method 5: Add an array of integers
    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        OverLoad calculator = new OverLoad();
        
        // Using different overloaded methods
        System.out.println("Add two ints: " + calculator.add(5, 3));
        System.out.println("Add three ints: " + calculator.add(5, 3, 2));
        System.out.println("Add two doubles: " + calculator.add(5.5, 3.2));
        System.out.println("Add two strings: " + calculator.add("Hello ", "World"));
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Add array: " + calculator.add(numbers));
    }
}
