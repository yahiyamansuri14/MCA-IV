package medicapsproject;;
import java.util.Scanner;
class Question4{
	public static void main(String args[]){
		System.out.println("Enter no");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a>b && a>c)
			System.out.println("A is greater");
		else{
			if(b>c)
				System.out.println("B is greater");
			else
				System.out.println("C is greater");
		}
		if(a<b && a<c)
			System.out.println("A is min");
		else{
			if(b<c)
				System.out.println("B is min");
			else
				System.out.println("C is min");
		}
	}
	
}