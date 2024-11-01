import java.util.Scanner;
public class SimpleRecursion {
    void printNumbers(int n){
        if (n > 0) {
            if (n==10) {
                System.out.println();
                System.out.println("Descending: ");
            }
            System.out.print(n + " ");
            printNumbers(n-1);
            if (n==1) {
                System.out.println();
                System.out.println("Ascending: ");
            }
            System.out.print(n + " ");
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        SimpleRecursion t1 = new SimpleRecursion();
        System.out.print("Enter Number: ");
        int no = sn.nextInt();
        t1.printNumbers(no);
    }
}