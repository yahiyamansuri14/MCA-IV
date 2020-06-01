import java.util.Scanner;
class Question7{
	public static void main(String args[]){
		System.out.println("Enter no");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int flag=1;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("No is prime");
		else
			System.out.println("No is not prime");
	}
}