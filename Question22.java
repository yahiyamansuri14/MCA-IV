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
public class Question22 {
    public static void main(String args[]){
        int a=10,b=20;
        int choice;
        System.out.println("Enter your choice\n1.addition2.substraction\n3.multiplication\n4.division\n");
        Scanner scan=new Scanner(System.in);
        choice=scan.nextInt();
        switch(choice){
            case 1:System.out.println(a+b);break;
            case 2:System.out.println(a-b);break;
            case 3:System.out.println(a*b);break;
            case 4:System.out.println(a/b);break;
            default:System.out.println("Wrong choice");
        }
    }
}
