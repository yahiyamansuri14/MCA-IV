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
public class Question12 {
    public void fibonacchi(int n){
        int a=-1,b=1,c=0;
        while(c<=n){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    public static void main(String args[]){
        Question12 obj=new Question12();
        obj.fibonacchi(15);
    }
}
