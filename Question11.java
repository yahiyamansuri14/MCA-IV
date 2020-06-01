/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicapsproject;

/**
 *
 * @author hp
 */
public class Question11 {
    public int palindrom(int n){
        int temp=n;
        int rem,rev=0;
       while(n!=0){
           rem=n%10;
           rev=rev*10+rem;
           n=n/10;
       }
       if(temp==rev)
           return 1;
       else 
           return 0;
    }
    public static void main(String args[]){
        Question11 obj=new Question11();
        int n=obj.palindrom(121);
        if(n==1)
               System.out.println("No is palindrom");
        else
                System.out.println("No is not palindrom");
    }
}
