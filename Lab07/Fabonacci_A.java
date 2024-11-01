import java.util.Scanner;

public class Fabonacci_A {
    // Through iterative
    public void generateFibonacci(int N) {
        int a = 0, b = 1;
        

        while (a <= N) {
            System.out.print(a + " ");
            int next = a + b; 
            a = b; 
            b = next;
        }
        
        System.out.println();
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fabonacci_A t4 = new Fabonacci_A();
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        
        System.out.println("Fibonacci Series up to " + N + ":");
        t4.generateFibonacci(N);
        
        scanner.close();
    }
   
}
