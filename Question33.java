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
class Shape{
    int width,height;
}
class Triangle extends Shape{
    Triangle(){
        width=10;height=10;
        System.out.println("Area of triagnle is:-"+(width*height)/2);
    }
}
class Rectangle extends Shape{
    Rectangle(){
        width=10;height=20;
        System.out.println("Area of rectangle is:-"+(height*width));
    }
}
public class Question33{
    public static void main(String args[]){
        Triangle t=new Triangle();
        Rectangle r=new Rectangle();
    }
}
