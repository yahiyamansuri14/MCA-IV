import java.util.Scanner;
class Question2{
	public static void main(String args[]){
		System.out.println("Enter two no");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Before swapping a="+a+"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a="+a+"b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a="+a+"b="+b);
	}
	
}