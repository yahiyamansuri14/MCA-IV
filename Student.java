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
//Question25
public class Student {
       int roll_no;
       String name;
       public void putData(int roll_no,String name){
           this.roll_no=roll_no;
           this.name=name;
       }
       public void getData(){
           System.out.println("Name is:="+this.name+"Roll no is:-"+this.roll_no);
       }
       public static void main(String args[]){
           Student s=new Student();
           Scanner scan=new Scanner(System.in);
           System.out.println("Enter name:-");
           String name=scan.nextLine();
           System.out.println("Enter rollno:-");
           int rollno=scan.nextInt();
           s.putData(rollno, name);
           s.getData();
       }
}
