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
public class Question13 {
    public void prineSeries(int n){
        for(int i=0;i<=n;i++){
           if(isPrime(i))
               System.out.println(i);
        }
    }
    public boolean isPrime(int n){
         if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
    
    public static void main(String args[]){
        Question13 obj=new Question13();
        obj.prineSeries(100);
    }
}
