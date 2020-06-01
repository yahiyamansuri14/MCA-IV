package medicapsproject;
import java.util.Scanner;
class Question9{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0,rem;
		while(n!=0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum:-"+sum);
	}
	
}