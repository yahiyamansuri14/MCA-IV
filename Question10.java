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
public class Question10 {
    int reverse(int n){
       int rem,rev=0;
       while(n!=0){
           rem=n%10;
           rev=rev*10+rem;
           n=n/10;
       }
       return rev;
    }
    public static void main(String args[]){
        Question10 obj=new Question10();
        System.out.println(obj.reverse(129));
        
    }
}
