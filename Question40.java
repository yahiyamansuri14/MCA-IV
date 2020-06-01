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
public class Question40 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no");
        int y=scan.nextInt();
        try{
            int c=100/y;
            System.out.println(c);
        }catch(Exception e){e.printStackTrace();}
    }
}
