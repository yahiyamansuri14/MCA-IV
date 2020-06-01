package medicapsproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Question31 {
    public void area(int r){
        System.out.println("Area of circle"+(3.14*r*r));
     }
    public void area(int l,int h){
        System.out.println("Area of rectngle"+(l*h));
    }
    public void area(double l,double b){
        System.out.println("Area of triangle"+(b*l)/2);
    }
    public static void main(String args[]){
        Question31 obj=new Question31();
        obj.area(5);
        obj.area(10, 20);
        obj.area(2.5, 3.6);
    }
}
