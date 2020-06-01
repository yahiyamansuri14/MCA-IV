package medicapsproject;
import java.util.Scanner;
class Question5{
	public static void main(String args[]){
			System.out.println("Enter no upto which you want sum");
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++)
				sum=sum+i;
			System.out.println("Sum is:-"+sum);
			
	}
}