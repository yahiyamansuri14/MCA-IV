
package medicapsproject;
import java.util.Scanner;
class Question6{
	public static void main(String args[]){
		System.out.println("Enter no");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("Factorial:-"+fact);
	}
}