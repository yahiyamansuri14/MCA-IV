package medicapsproject;
import java.util.Scanner;
class Question1{

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any two no");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
}