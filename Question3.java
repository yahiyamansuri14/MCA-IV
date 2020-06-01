import java.util.Scanner;
class Question3{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>b)
			System.out.println("A is greater and b is small");
		else
			System.out.println("B is greater and a is small");
	}
}