/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicapsproject;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Question18 {
    public void searchElement(int x,int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                System.out.println("Element found in array");
                break;
            }
                
        }
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no to be searched");
        int x=scan.nextInt();
        int a[]={10,20,30,40,50,60,70,80,90,100};
        Question18 obj=new Question18();
        obj.searchElement(x,a);
    }
    
}
