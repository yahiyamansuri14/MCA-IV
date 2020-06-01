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
//Question29
public class Employee {
    String name;
    int salary;
    
    public void putData(String name,int salary ){
        this.name=name;
        this.salary=salary;
    }
    public void getData(){
        System.out.println("Name:-"+this.name+"salary:-"+this.salary);
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name and salary");
        String name=scan.nextLine();
        int salary=scan.nextInt();
        Employee obj=new Employee();
        obj.putData(name, salary);
        obj.getData();
    }
}
