import java.util.Scanner;
class Question8{
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		int rem,sum=0;
		while(n!=0){
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("No is armstrong");
		else
			System.out.println("No is not armstrong");
	}
}