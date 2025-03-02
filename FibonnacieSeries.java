import java.util.Scanner;

public class FibonnacieSeries {
    public static void main(String x[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the limit of series");
	int limit = sc.nextInt();
	int f1 = 0;
	int f2 = 1;
	int fib = 0;
	
	while(f1 <= limit){
	     System.out.print(f1 + " ");
	     	
	     fib = f1 + f2;
	     f1 = f2;
	     f2 = fib;
	}
    }
}