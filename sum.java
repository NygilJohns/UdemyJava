package U_Java;
import java.util.Scanner;
public class sum {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter two numbers :");
		x=sc.nextInt();
		y=sc.nextInt();
		int z=x+y;
		System.out.println("sum is :"+z);
	}
}